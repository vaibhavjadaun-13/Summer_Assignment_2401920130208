import java.util.*;

public class NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {

            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of nums1: ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}