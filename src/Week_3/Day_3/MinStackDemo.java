import java.util.Scanner;
import java.util.Stack;

class MinStack {

    Stack<Integer> alldata = new Stack<>();
    Stack<Integer> mindata = new Stack<>();

    public void push(int val) {

        alldata.push(val);

        if (mindata.isEmpty() || val <= mindata.peek()) {
            mindata.push(val);
        }
    }

    public void pop() {

        int val = alldata.pop();

        if (val == mindata.peek()) {
            mindata.pop();
        }
    }

    public int top() {
        return alldata.peek();
    }

    public int getMin() {
        return mindata.peek();
    }
}

public class MinStackDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MinStack st = new MinStack();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String op = sc.next();

            if (op.equals("push")) {
                int val = sc.nextInt();
                st.push(val);
            }
            else if (op.equals("pop")) {
                st.pop();
            }
            else if (op.equals("top")) {
                System.out.println(st.top());
            }
            else if (op.equals("min")) {
                System.out.println(st.getMin());
            }
        }

        sc.close();
    }
}