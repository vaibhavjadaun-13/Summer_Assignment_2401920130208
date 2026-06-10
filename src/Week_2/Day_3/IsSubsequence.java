import java.util.Scanner;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int n = s.length();
        int m = t.length();

        if (n == 0) return true;

        int i = 0;

        for (int j = 0; j < m; j++) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;

                if (i == n) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter t: ");
        String t = sc.nextLine();

        System.out.println(isSubsequence(s, t));

        sc.close();
    }
}