package dsa.string;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String val =sc.next();
        System.out.println(reverseString(val));
    }
    private static String reverseString(String s){
        int start = 0;
        int end = s.length()-1;
        char[] ch = s.toCharArray();
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}
