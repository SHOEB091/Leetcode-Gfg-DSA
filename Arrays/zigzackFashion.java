package Arrays;

public class zigzackFashion {
    
    static void zigzackArray(int[]arr){
        boolean zigZagFlag = true;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (zigZagFlag) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            zigZagFlag = !zigZagFlag;
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigzackArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}