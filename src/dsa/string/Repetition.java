package dsa.string;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String v = sc.nextLine();
        char[] ch = v.toCharArray();
        int count = 1;
        for (int i = 0; i < ch.length; i++) {
            if (i < ch.length - 1 && ch[i] == ch[i + 1]) {
                count++;
            } else {
                System.out.print(count + "" + ch[i]);
                count = 1;
            }
        }
    }
}
