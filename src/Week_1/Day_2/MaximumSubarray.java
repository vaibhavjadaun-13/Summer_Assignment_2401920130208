import java.util.Scanner;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int cs = nums[0]; // Current Sum
        int os = nums[0]; // Overall Sum

        for (int i = 1; i < nums.length; i++) {
            if (cs + nums[i] > nums[i]) {
                cs = cs + nums[i];
            } else {
                cs = nums[i];
            }

            os = Math.max(cs, os);
        }

        return os;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();
    }
}