package dsa.basics;

import java.util.Scanner;

/*
To find out whether the given String is Palindrome or not.
 */
public class PalindromeNum {
    public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number ");
        int n = sc.nextInt();
        int temp = n;
        int rem=0,rev=0;
        while(temp!=0){
            rem=temp%10;
            rev = (rev*10)+rem;
            temp/=10;
        }
        if(rev==n){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }
}
