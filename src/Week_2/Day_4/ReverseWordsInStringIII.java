import java.util.Scanner;

public class ReverseWordsInStringIII {

    public static String reverseWords(String s) {

        char[] arr = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {

            if (end == arr.length || arr[end] == ' ') {

                int left = start;
                int right = end - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = end + 1;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.println(reverseWords(s));

        sc.close();
    }
}