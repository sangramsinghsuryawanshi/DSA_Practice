package dsa.basics;

import java.util.Scanner;

/*
Take 2 numbers as input and print the largest number.
 */
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("First number is largest");
        } else {
            System.out.println("Second number is largest");
        }
    }
}
