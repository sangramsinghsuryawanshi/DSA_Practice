package dsa.basics;

import java.util.Scanner;

/*
Write a program to print whether a number is even or odd, also take input from the user.
 */
public class EvenOdd {
    public static void main(String[] ar) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n number: \n");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
