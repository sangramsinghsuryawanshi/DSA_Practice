package dsa.basics;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        long start1 = System.nanoTime();
        int hcf1 = isHCF1(a, b);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        int hcf2 = isHCF2(a, b);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        int hcf3 = isHCF3(a, b);
        long end3 = System.nanoTime();

        System.out.println("\nHCF 1 = " + hcf1);
        System.out.println("Time = " + (end1 - start1) + " ns");

        System.out.println("\nHCF 2 = " + hcf2);
        System.out.println("Time = " + (end2 - start2) + " ns");

        System.out.println("\nHCF 3 = " + hcf3);
        System.out.println("Time = " + (end3 - start3) + " ns");
    }

    public static int isHCF1(int a, int b) {
        if (b == 0) {
            return a;
        }
        return isHCF1(b, a % b);
    }

    public static int isHCF2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int isHCF3(int a, int b) {
        int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }
}
