package dsa.basics;

/**
 * LCM Of Two Numbers
 */

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[a];
        int[] brr = new int[b];

        int x = 0;
        int y = 0;

        // Factors of a
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                arr[x++] = i;
            }
        }

        // Factors of b
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                brr[y++] = i;
            }
        }

        int max = 1;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i] == brr[j]) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
            }
        }

        System.out.println("GCD = " + max);
    }
}