import java.util.Scanner;
import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {

            System.out.println(
                    "Swapping '" + s[i] + "' at index " + i +
                            " with '" + s[j] + "' at index " + j
            );

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseString(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));

        System.out.println("Reversed String: " + new String(arr));

        sc.close();
    }
}