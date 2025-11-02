package BitManipulation;

public class bitsLearning {
    // types of bit manipulation operations
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011
        int c = -5;

        // AND operation
        int andResult = a & b; // Binary: 0001 (Decimal: 1)
        System.out.println("AND Operation: " + andResult);
        System.out.println(Integer.toBinaryString(andResult));

        // OR operation
        int orResult = a | b; // Binary: 0111 (Decimal: 7)
        System.out.println("OR Operation: " + orResult);
        System.out.println(Integer.toBinaryString(orResult));

        // XOR operation
        int xorResult = a ^ b; // Binary: 0110 (Decimal: 6)
        System.out.println("XOR Operation: " + xorResult);
        System.out.println(Integer.toBinaryString(xorResult));

        // NOT operation
        int notResult = ~a; // Binary: ...11111010 (Decimal: -6 in 32-bit signed integer)
        System.out.println("NOT Operation: " + notResult);
        System.out.println(Integer.toBinaryString(notResult));

        // Left Shift operation
        int leftShiftResult = a << 1; // Binary: 1010 (Decimal: 10)
        System.out.println(Integer.toBinaryString(a));
        System.out.println("Left Shift Operation: " + leftShiftResult);
        System.out.println(Integer.toBinaryString(leftShiftResult));

        // Right Shift operation
        int rightShiftResult = a >> 1; // Binary: 0010 (Decimal: 2)
        System.out.println(Integer.toBinaryString(a));
        System.out.println("Right Shift Operation: " + rightShiftResult);
        System.out.println(Integer.toBinaryString(rightShiftResult));

        //unsigned Right Shift operation
        int unsignedRightShiftResult = c >>> 2; // Binary: 0010 (Decimal: 2)
        System.out.println(Integer.toBinaryString(c));
        System.out.println("Unsigned Right Shift Operation: " + unsignedRightShiftResult);
        System.out.println(Integer.toBinaryString(unsignedRightShiftResult));
    }


}
