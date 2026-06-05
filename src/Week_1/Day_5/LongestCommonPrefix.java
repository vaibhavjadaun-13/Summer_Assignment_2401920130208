import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string array");
        String input = sc.nextLine();
        input = input.substring(1, input.length() - 1);
        String[] strs = input.split(",");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].trim();
        }
        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
        sc.close();
    }
}