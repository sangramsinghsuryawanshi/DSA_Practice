package dsa.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] ar) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string value: ");
            String value = sc.nextLine();
            System.out.println("Frequency of each character: " + returnFrequency(value));
        }
    }

    private static Map<Character, Integer> returnFrequency(String value) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : value.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
