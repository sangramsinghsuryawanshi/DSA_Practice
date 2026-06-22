package dsa.basics;
/*
To calculate Fibonacci Series up to n numbers.
 */
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[]qr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number: ");
        int n = sc.nextInt();
        int a=0,b=1,cnt=0,sum=0;
        while(cnt<=n){
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
            cnt++;
        }
    }
}
