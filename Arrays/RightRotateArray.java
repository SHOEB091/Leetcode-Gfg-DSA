package Arrays;

public class RightRotateArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void rightRotate(int[] arr, int rotate) {
        int size = arr.length;
        int count = ((rotate % size) + size) % size;

        for (int i = 0; i < count; i++) {
            rotateByOne(arr);
        }
    }

    public static void rotateByOne(int[] arr) {
        int size = arr.length;
        int last = arr[size - 1];
        for (int j = size - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(arr);
        rightRotate(arr, 3);
        printArray(arr); // Should print the rotated array
    }
}