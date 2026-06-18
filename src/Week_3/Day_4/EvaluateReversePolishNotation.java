import java.util.Scanner;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }
            else if (token.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }
            else if (token.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }
            else if (token.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }
            else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tokens: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] tokens = new String[n];

        System.out.println("Enter tokens:");

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.nextLine();
        }

        System.out.println(evalRPN(tokens));

        sc.close();
    }
}