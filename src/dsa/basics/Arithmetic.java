package dsa.basics;
/*
Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
 */

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a operator: ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter a first number: ");
        int a = sc.nextInt();
        System.out.println("Enter a second number: ");
        int b = sc.nextInt();
        int result = 0;
        if (ch == '+') {
            result = a + b;
        } else if (ch == '-') {
            result = a - b;
        } else if (ch == '*') {
            result = a * b;
        } else if (ch == '/') {
            if (a != 0) {
                result = a / b;
            } else {
                System.out.println("a number cannot be divisible by zero");
            }
        } else {
            System.out.println("Invalid operator..");
        }
        System.out.println("Result: "+result);
    }
}
