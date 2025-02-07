package LinkedList;



public class linkedlist {
    // head, tail concept 
    public static Node head;
    public static Node tail;
    public static int size;

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // methods 
    // add()
    // remove()
    // print()
    // search()
    public static void addFirst(int data) {
        // step1 create new Node
        Node newNode = new Node(data);
        size ++;  //track the size;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 new node next = head 
        newNode.next = head;
        // step3 - head = newNode
        head = newNode;
    }

    public static void addLast(int data){
        //step1 create new Node 
        Node newNode = new Node(data);
        size ++; // track the size 
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public static void print(){
        if(head==null){
            System.out.print("LinkedList is Empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ->");temp=temp.next;
        }
        System.out.println(" null");
    }

    //add in the middle of the linked list 
    public void addMiddle(int index, int data){
        if(index ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        // to track the size of data;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        //i-> index-1; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }




    //delete firstNode
    public static int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return -1;
        }
        else if(size ==1){// size ak hi hai node ka toh woh head ko point karega aur usme phir head ko delete karega jisse null bachega 
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head= head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return -1;
        
        }
        else if(size==1){
            int val = head.data;
            head= tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next= null;
        tail = prev;
        size --;
        return val;

    }

    //searching via iteration 
    public static int iterativeSearch(int key){
        Node temp = head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                //key found 
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //recursive 
    public static int helper(Node head , int key){
        if(head==null){
            return 0;
        }

        if(head.data==key){
            return 0;
        }
        int index = helper(head.next,key);
        if(index == -1){
            return -1;
        }
        return index+1;

    }

    public static int recSearch(int key){
        return helper(head,key);
    }

    //Reverse LinkedList 
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        head = prev;
    }

    //Delete from nth node 
    public static void deleteFromNthNode(int n){
        //calculate size();
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(n==size){
            head = head.next;
        }

        int i=1;
        int iToFInd = size-n;
        Node prev = head;
        while(i< iToFInd){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    //findding mid to check palindrome 
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head ==null || head.next!=null){
            return true;
        }

        //step1 find mid 
        Node midNode = findMid(head);

        //step2 - reverse second half 
        Node prev = null;
        Node current = midNode;
        Node next;
        while(current != null){
            next = current.next;
            current.next= prev;
            prev = current;
            current = next;
        }
        Node right = prev;
        Node left = head;
        //step 3 check left half and right half 
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    //code Section to Detect Cycle in a Loop 
    public static boolean detectCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
           
            if(fast==slow){ //cycle is formed 
               return true;
            }
        }
      
        return false;
       }

        
    

    // Code Section to remove a Loop Cycle in a Linked list 
    //1. find last node 
    //2 make last node.next = null
        //-> slow = head
    public static void removeCycle(){

        //detect cycle
        Node slow  =head;
        Node fast = head;

        boolean cycle = true;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                cycle = true;
                break;   
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting Point 

        slow = head ;
        Node prev = null; //pointing towards last node 
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle 
        prev .next = null;

    }  


    
    // Applying Merge Sort on a Linked List 
public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    // Finding mid node 
    Node mid = findMid(head);

    // Apply left and right half merge sort
    Node righthead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(righthead);

    return merge(newLeft, newRight);
}

//Merge Sort on a Linked List 
private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while (head1 != null && head2 != null) {
        if (head1.data <= head2.data) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
    while (head1 != null) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }
    while (head2 != null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return mergedLL.next;
}

    //Zig Zac Linked List 
    public void zigzag(){
        //find Mid 
        Node mid = findMid(head);

        //reverse2nd half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        Node nextll , nextR;

        //alternate merging zigzag merge

        while(left!=null && right !=null){
            nextll = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextll;

            left = nextll;
            right = nextR;
        }

    }



    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst(20);
        ll.addFirst(10);
        // Add more operations as needed
        ll.addLast(30);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.addLast(80);
        ll.addLast(90);


        ll.addMiddle(2, 9);

        ll.print();

      /*  ll.removeFirst();
        ll.print();

         ll.removeLast();
        ll.print(); 
      */  
        //System.out.println(ll.iterativeSearch(10));
       
        ll.reverse();
        ll.print();

        ll.deleteFromNthNode(3);
        ll.print();

        ll.zigzag();
        ll.print();
    }
}
