import java.util.Scanner;

public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Primary Diagonal Element: mat[" + i + "][" + i + "] = " + mat[i][i]);
            sum += mat[i][i];

            if (i != n - 1 - i) {
                System.out.println("Secondary Diagonal Element: mat[" + i + "][" + (n - 1 - i) + "] = " + mat[i][n - 1 - i]);
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int result = diagonalSum(mat);

        System.out.println("\nDiagonal Sum = " + result);

        sc.close();
    }
}