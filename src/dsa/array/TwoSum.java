package dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the target element: ");
            int target = sc.nextInt();
            twoSum(arr, target);
        }
    }

    public static void twoSum1(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: " + left + "  " + right);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found");
    }

    public static void twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Key: element value, Value: original index

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}
