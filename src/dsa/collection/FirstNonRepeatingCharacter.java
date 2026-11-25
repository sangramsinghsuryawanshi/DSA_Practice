package dsa.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        try(Scanner sc =  new Scanner(System.in)){
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.print("First non-repeating character is: "+ findFirstNonRepeatingChar(str));
        }
    }
    private static char findFirstNonRepeatingChar(String str){
        if(str.length()<2){
            return str.charAt(0);
        }
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> ent : map.entrySet()){
            if(ent.getValue()==1){
                return ent.getKey();
            }
        }
        return '\u0000';
    }
}
