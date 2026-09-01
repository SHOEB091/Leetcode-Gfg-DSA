package Queue;

public class circularQueue {
    // suppose we have given a queue arr = { 2,3,4,5,6, }
    // we add 7 in thee queue [2,3,4,5,6,7]
    //now we remove 2 from the queue [3,4,5,6,7]
    // now we add 8 in the queue [3,4,5,6,7] -> [8,3,4,5,6,7]
    //now we add 9 in the queue [8,3,4,5,6,7] -> [8,9,3,4,5,6]
    // so (Rear + 1)%size == front means queue is full
    // in this rear = (reqar + 1) % size
    public static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //1st element added
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            //single element
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        } 
       
    }
}
