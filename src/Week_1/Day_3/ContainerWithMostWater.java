import java.util.Scanner;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea, width * h);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertical lines:");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter the heights of the vertical lines:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println("Maximum amount of water that can be stored:");
        System.out.println(maxArea(height));

        sc.close();
    }
}