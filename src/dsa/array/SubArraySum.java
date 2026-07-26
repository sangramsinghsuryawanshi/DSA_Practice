package dsa.array;

public class SubArraySum {
    public static void main(String[] ar) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int b[] = {1};
        int c[] = {5, 4, -1, 7, 8};
        int maxA = maxSubArray(a);
        int maxB = maxSubArray(b);
        int maxC = maxSubArray(c);
        System.out.println("a: " + maxA + ", b: " + maxB + ", c: " + maxC);
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
