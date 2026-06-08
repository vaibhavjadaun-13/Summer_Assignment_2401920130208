import java.util.Scanner;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        System.out.println("\nCounting Frequencies:");

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
            System.out.println(
                    ch + " -> " + freq[ch - 'a']
            );
        }

        System.out.println("\nFinding First Unique Character:");

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            System.out.println(
                    "Checking '" + ch + "' at index " + i +
                            " | Frequency = " + freq[ch - 'a']
            );

            if (freq[ch - 'a'] == 1) {
                System.out.println(
                        "First Unique Character Found: '" +
                                ch + "' at index " + i
                );
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        int result = firstUniqChar(s);

        System.out.println("\nAnswer = " + result);

        sc.close();
    }
}