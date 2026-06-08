import java.util.Scanner;

public class RansomNote {

    public static boolean canConstruct(String s, String t) {

        if (s.length() > t.length()) {
            System.out.println("Ransom note is longer than magazine.");
            return false;
        }

        int[] freq = new int[26];

        System.out.println("\nCounting characters in magazine:");

        for (char ch : t.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)('a' + i) + " -> " + freq[i]);
            }
        }

        System.out.println("\nUsing characters for ransom note:");

        for (char ch : s.toCharArray()) {

            System.out.println(
                    "Checking '" + ch + "' | Available = "
                            + freq[ch - 'a']
            );

            if (freq[ch - 'a'] == 0) {
                System.out.println("'" + ch + "' not available.");
                return false;
            }

            freq[ch - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String s = sc.nextLine().toLowerCase();

        System.out.print("Enter magazine: ");
        String t = sc.nextLine().toLowerCase();

        boolean result = canConstruct(s, t);

        System.out.println("\nCan Construct? " + result);

        sc.close();
    }
}