import java.util.*;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] freq = new int[26];

        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while (right < s.length()) {

            char curr = s.charAt(right);

            if (freq[curr - 'a'] > 0) {
                count--;
            }

            freq[curr - 'a']--;
            right++;

            if (count == 0) {
                ans.add(left);
            }

            if (right - left == p.length()) {

                char remove = s.charAt(left);

                if (freq[remove - 'a'] >= 0) {
                    count++;
                }

                freq[remove - 'a']++;
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter p: ");
        String p = sc.nextLine();

        List<Integer> result = findAnagrams(s, p);

        System.out.println("Anagram Starting Indices: " + result);

        sc.close();
    }
}