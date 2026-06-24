package dsa.basics;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number: ");
        int n = sc.nextInt();
        int fact = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of number is: " + fact);
    }
}
