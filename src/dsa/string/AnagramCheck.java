package dsa.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramCheck {
    static Map<Character,Integer> map=new LinkedHashMap<>();
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the string 1: ");
            String str=sc.nextLine();
            System.out.print("Enter the string 2: ");
            String str2=sc.nextLine();
            Map<Character,Integer> map=new LinkedHashMap<>();
            for(char c:str.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            Map<Character,Integer> map2=new LinkedHashMap<>();
            for(char c:str2.toCharArray()){
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
            System.out.println(isAnagram(str,str2));
            System.out.println(isAnagram2(str,str2));
        }
    }
    private static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> map2=new LinkedHashMap<>();
        for(char c:s2.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        return map.equals(map2);
    }
    private static boolean isAnagram2(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
