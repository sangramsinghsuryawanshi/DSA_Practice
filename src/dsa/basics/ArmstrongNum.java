package dsa.basics;
/*
To find Armstrong Number between two given number.
 */
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number: ");
        int n = sc.nextInt();
        int temp=n,rem=0,rev=0;
        while(temp!=0){
            rem=temp%10;
            rev+=(rem*rem*rem);
            temp/=10;
        }
        if(rev==n){
            System.out.println("Given number is Armstrong");
        }else{
            System.out.println("Given number is Armstrong");
        }
    }
}
