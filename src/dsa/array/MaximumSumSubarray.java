package dsa.array;

import java.util.Scanner;

public class MaximumSumSubarray {
    public static long maxSumSubarray(int[] arr, int k) {
        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }
        long sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        long max =  sum;
        for(int i = k; i < arr.length; i++){
            sum = sum + arr[i] - arr[i-k];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSumSubarray(arr, k));
    }
}
