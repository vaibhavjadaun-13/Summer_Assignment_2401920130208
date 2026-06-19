import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class RecentCounter {

    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {

        q.offer(t);

        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll();
        }

        return q.size();
    }
}

public class NumberOfRecentCalls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RecentCounter rc = new RecentCounter();

        System.out.print("Enter number of pings: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            System.out.println(rc.ping(t));
        }

        sc.close();
    }
}