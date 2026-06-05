import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                System.out.println("Skipping '" + s.charAt(i) + "' at index " + i);
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                System.out.println("Skipping '" + s.charAt(j) + "' at index " + j);
                j--;
            }

            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(j));

            System.out.println(
                    "Comparing '" + left + "' (index " + i + ") with '" +
                            right + "' (index " + j + ")"
            );

            if (left != right) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = isPalindrome(s);

        System.out.println("\nIs Palindrome? " + result);

        sc.close();
    }
}