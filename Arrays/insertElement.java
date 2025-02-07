package Arrays;

public class insertElement {

    public static void insertelement(int[] arr, int target, int index){

        int newArray[] = new int[arr.length+1];
        for(int i=0;i<index;i++){ //copying elements 
            newArray[i]= arr[i];
        }
        newArray[index]=target;

        for(int i=index;i<arr.length;i++){
            newArray[i+1]=arr[i];
        }
        for(int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] ={10,20,30,40,60};
        int target =25;
        int index =3;
       insertelement(arr, target, index);
       
    }
}
