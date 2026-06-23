package dsa.basics;

import java.util.Scanner;

/**
 * Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
 */
public class PriSumOfAlNum {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.MIN_VALUE;
        System.out.println("1.Enter numbers to achieve sum of number.\n 2. Enter 0 to exite.");
        int sum = 0;
        while (n != 0) {
            int value = sc.nextInt();
            if (value == 0) {
                n = value;
                System.out.println("Exited");
            } else {
                sum += value;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
