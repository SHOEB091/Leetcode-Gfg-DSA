package ARRAY2D;

public class Matrix {

    public static void main(String[] args) {
        createMatrix();
    }

    public static void createMatrix() {

        int[][] a = new int[5][5];

        // Create matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0 || i == 4 || j == 4) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
        }

        // Print matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
