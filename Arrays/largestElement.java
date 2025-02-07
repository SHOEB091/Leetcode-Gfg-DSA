package Arrays;
import java.util.Scanner;

public class largestElement {

    public static void findSecondLargest(int[]arr){

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
            
        }

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondlargest);
        }
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of aarray");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        findSecondLargest(arr);

        sc.close();
    }
}
