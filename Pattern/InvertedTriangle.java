package Pattern;

public class InvertedTriangle {

    // Prints a centered inverted pyramid of height N
    public static void inverted(int N) {
        for (int i = 0; i < N; i++) {
            // Leading spaces increase each row
            for (int s = 0; s < i; s++) System.out.print(" ");

            // Stars decrease by 2 each row: top = 2*N-1, then ... , 1
            int stars = 2 * (N - i) - 1;
            for (int k = 0; k < stars; k++) System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 9;
        inverted(N);
    }
}