package dsa.basics;
/*
Input currency in rupees and output in USD
 */
import java.util.Scanner;
public class CurrencyExe {
    public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupees");
        int rs = sc.nextInt();
        float usd = (float) rs /93;
        System.out.println("Amount in USD is: "+usd);
    }
}
