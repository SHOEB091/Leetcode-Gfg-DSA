package Arrays;

public class deleteElementInArray {

    public void deleteElement(int[] arr, int pos){
        int size = arr.length;
        if(pos<=0 || pos>size){
            System.out.println("Invalid position");
        }
        else{
            for(int i=pos-1; i<size-1; i++){ //shifting all elements after the target position one step to the left
            
    /*
        Example: For arr = {10, 20, 30, 40, 50} and pos = 3:
Starting at index 2 (because array indexing is 0-based, and pos - 1 = 2):
arr[2] = arr[3] → {10, 20, 40, 40, 50}
arr[3] = arr[4] → {10, 20, 40, 50, 50}
     */

                arr[i]=arr[i+1];
        }
                size--;
            }

            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }

    }
    


    public static void main(String[] args) {
        deleteElementInArray obj = new deleteElementInArray();
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 3; // Position to delete (1-based index)
        obj.deleteElement(arr, pos);
    }
}
