import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i = 1; i < n; i++) {

            while (!st.isEmpty() &&
                    temperatures[i] > temperatures[st.peek()]) {

                int index = st.pop();
                ans[index] = i - index;
            }

            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of temperatures: ");
        int n = sc.nextInt();

        int[] temperatures = new int[n];

        System.out.println("Enter temperatures:");

        for (int i = 0; i < n; i++) {
            temperatures[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(
                dailyTemperatures(temperatures)
        ));

        sc.close();
    }
}