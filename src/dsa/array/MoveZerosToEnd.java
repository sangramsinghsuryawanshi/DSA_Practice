package dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] ar) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The array after moving zeros: " + Arrays.toString(moveZeros(arr)));
            System.out.println("The array after moving zeros: " + Arrays.toString(moveZeros1(arr)));

        }
    }

    private static int[] moveZeros1(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }
        return arr;
    }

    private static int[] moveZeros(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
