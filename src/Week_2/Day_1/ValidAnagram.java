import java.util.Scanner;

public class ValidAnagram {

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            System.out.println("Lengths are different.");
            return false;
        }

        int[] freq = new int[26];

        System.out.println("\nAdding characters of first string:");

        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
            System.out.println(
                    "freq[" + ch + "] = " + freq[ch - 'a']
            );
        }

        System.out.println("\nRemoving characters of second string:");

        for (char ch : s2.toCharArray()) {
            freq[ch - 'a']--;
            System.out.println(
                    "freq[" + ch + "] = " + freq[ch - 'a']
            );
        }

        System.out.println("\nChecking frequency array:");

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println(
                        (char)('a' + i) + " has frequency " + freq[i]
                );
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase();

        boolean result = isAnagram(s1, s2);

        System.out.println("\nIs Anagram? " + result);

        sc.close();
    }
}