package Pattern;

public class DiamondPatter {

    public static void diamond(int N) {
        // Upper pyramid
        for (int i = 0; i < N; i++) {
            for (int s = 0; s < N - i - 1; s++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) System.out.print("*");
            System.out.println();
        }

        // Lower (inverted) pyramid: start at N-2 to avoid repeating the middle row
        for (int i = N - 2; i >= 0; i--) {
            for (int s = 0; s < N - i - 1; s++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        diamond(N);
    }
}