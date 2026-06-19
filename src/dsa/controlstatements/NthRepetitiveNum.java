package dsa.controlstatements;

import java.util.Scanner;

public class NthRepetitiveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a n number");
        int num = input.nextInt();
        int temp = num;
        int rem=0,rev=0;
        while(temp!=0){
            rem = temp %10;
            rev = (rev*10)+rem;
            System.out.println(rev);
            temp/=10;
        }
    }
}
