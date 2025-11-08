package WrapperClasses;

public class Test {
    // Wrapper Classes are used to convert primitive data types into objects
    public static void main(String[] args) {
        // Primitive data types
        int a =1;
        Integer b =1;
        int c =b;

        boolean hasGraphicCard = true;
        boolean isAdult = true;

        Float f = 1.2f;
        Double d = 1.2;
        Character h = 'c';
        Byte bb = 1;
        Short s = 2;
        Long l = 123l;

        System.out.println(Integer.max(1, 2));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.min(1,2));
        String str = "123";
        Integer.valueOf(str);


        
    }
}
