import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode i = list1;
        ListNode j = list2;

        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while (i != null && j != null) {

            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }

            k = k.next;
        }

        if (i == null) {
            k.next = j;
        } else {
            k.next = i;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();

        ListNode list1 = null, tail1 = null;

        if (n1 > 0) {
            list1 = new ListNode(sc.nextInt());
            tail1 = list1;

            for (int i = 1; i < n1; i++) {
                tail1.next = new ListNode(sc.nextInt());
                tail1 = tail1.next;
            }
        }

        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();

        ListNode list2 = null, tail2 = null;

        if (n2 > 0) {
            list2 = new ListNode(sc.nextInt());
            tail2 = list2;

            for (int i = 1; i < n2; i++) {
                tail2.next = new ListNode(sc.nextInt());
                tail2 = tail2.next;
            }
        }

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(merged);

        sc.close();
    }
}