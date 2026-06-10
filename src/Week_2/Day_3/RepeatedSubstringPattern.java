import java.util.Scanner;

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {

        String doubled = s + s;
        String trimmed = doubled.substring(1, doubled.length() - 1);

        return trimmed.contains(s);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(repeatedSubstringPattern(s));

        sc.close();
    }
}