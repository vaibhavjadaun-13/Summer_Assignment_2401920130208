import java.util.Scanner;
import java.util.Stack;

class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {

        if (output.isEmpty()) {

            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

public class ImplementQueueUsingStacks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyQueue q = new MyQueue();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String op = sc.next();

            if (op.equals("push")) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if (op.equals("pop")) {
                System.out.println(q.pop());
            }
            else if (op.equals("peek")) {
                System.out.println(q.peek());
            }
            else if (op.equals("empty")) {
                System.out.println(q.empty());
            }
        }

        sc.close();
    }
}