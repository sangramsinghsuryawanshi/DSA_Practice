package dsa.basics;
/*

 */

import java.util.Scanner;

public class NPRandCPR {
    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid Input");
            return;
        }

        long npr = factorial(n) / factorial(n - r);
        long ncr = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("NPR = " + npr);
        System.out.println("NCR = " + ncr);

        sc.close();
    }
}
