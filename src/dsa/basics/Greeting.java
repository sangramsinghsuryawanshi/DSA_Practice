package dsa.basics;

import java.util.Scanner;

/*
Take name as input and print a greeting message for that particular name
 */
public class Greeting {
    public static void main(String[]ar){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = in.nextLine();
        if(name.equals("raj")){
            System.out.println("Hello Raj!");
        }
    }
}
