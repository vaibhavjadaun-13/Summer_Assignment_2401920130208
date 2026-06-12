import java.util.Scanner;

public class StringCompression {

    public static int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            chars[index++] = current;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        char[] chars = s.toCharArray();

        int length = compress(chars);

        System.out.print("Compressed: ");

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();
        System.out.println("Length = " + length);

        sc.close();
    }
}