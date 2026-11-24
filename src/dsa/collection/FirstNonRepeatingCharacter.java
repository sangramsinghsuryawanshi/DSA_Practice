package dsa.collection;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        try(Scanner sc =  new Scanner(System.in)){
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.print("First non-repeating character is: "+findFirstNonRepeteating);
        }
    }
}
