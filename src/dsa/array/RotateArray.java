
package dsa.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
        int k = 300000000;

        int[] arr1 = Arrays.copyOf(original, original.length);
        int[] arr2 = Arrays.copyOf(original, original.length);

        // Brute Force
        long start1 = System.nanoTime();

        rotateArray(arr1, k);

        long end1 = System.nanoTime();

        // Optimized
        long start2 = System.nanoTime();

        rotateArrayOptimized(arr2, k);

        long end2 = System.nanoTime();

        System.out.println("Brute Force Result: "
                + Arrays.toString(arr1));

        System.out.println("Optimized Result: "
                + Arrays.toString(arr2));

        System.out.println("Brute Force Time: "
                + (end1 - start1) + " ns");

        System.out.println("Optimized Time: "
                + (end2 - start2) + " ns");
    }

    private static int[] rotateArray(int[] arr, int k) {

        if (k <= 0 || arr.length == 0) return arr;

        for (int i = 0; i < k; i++) {

            int temp = arr[arr.length - 1];

            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = temp;
        }

        return arr;
    }

    private static int[] rotateArrayOptimized(int[] arr, int k) {

        int n = arr.length;

        if (n == 0) return arr;

        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
