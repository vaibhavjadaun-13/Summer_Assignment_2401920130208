import java.util.Scanner;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0;
        int right = 0;
        int count = s1.length();

        while (right < s2.length()) {

            char curr = s2.charAt(right);

            if (freq[curr - 'a'] > 0) {
                count--;
            }

            freq[curr - 'a']--;
            right++;

            if (count == 0) {
                return true;
            }

            if (right - left == s1.length()) {

                char remove = s2.charAt(left);

                if (freq[remove - 'a'] >= 0) {
                    count++;
                }

                freq[remove - 'a']++;
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter s2: ");
        String s2 = sc.nextLine();

        boolean result = checkInclusion(s1, s2);

        System.out.println("Answer: " + result);

        sc.close();
    }
}