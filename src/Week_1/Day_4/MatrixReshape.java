import java.util.Scanner;
import java.util.Arrays;

public class MatrixReshape {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        System.out.println("\nOriginal Matrix:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }

        if (m * n != r * c) {
            System.out.println("\nReshape not possible!");
            return mat;
        }

        int[][] res = new int[r][c];

        System.out.println("\nMapping Process:");

        for (int i = 0; i < m * n; i++) {
            int oldRow = i / n;
            int oldCol = i % n;

            int newRow = i / c;
            int newCol = i % c;

            System.out.println(
                    "mat[" + oldRow + "][" + oldCol + "] = "
                            + mat[oldRow][oldCol]
                            + " -> res[" + newRow + "][" + newCol + "]"
            );

            res[newRow][newCol] = mat[oldRow][oldCol];
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter columns (n): ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter new rows (r): ");
        int r = sc.nextInt();

        System.out.print("Enter new columns (c): ");
        int c = sc.nextInt();

        int[][] result = matrixReshape(mat, r, c);

        System.out.println("\nReshaped Matrix:");

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }
}