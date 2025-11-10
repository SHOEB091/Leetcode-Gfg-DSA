package Generics;

class Utils {
    public static <T> void printArray(T[] arr) {
        for (T item : arr)
            System.out.println(item);
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        String[] names = { "Shoeb", "Rahul" };
        Integer[] nums = { 1, 2, 3 };

        Utils.printArray(names);
        Utils.printArray(nums);

    }
}
