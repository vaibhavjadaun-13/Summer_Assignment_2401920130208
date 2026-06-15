import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(false);
            return;
        }

        System.out.println("Enter node values:");

        ListNode[] nodes = new ListNode[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new ListNode(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        System.out.print("Enter pos (-1 for no cycle): ");
        int pos = sc.nextInt();

        if (pos >= 0) {
            nodes[n - 1].next = nodes[pos];
        }

        System.out.println(hasCycle(nodes[0]));

        sc.close();
    }
}