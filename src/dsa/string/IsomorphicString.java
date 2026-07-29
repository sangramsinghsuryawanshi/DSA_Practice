package dsa.string;

import java.util.HashMap;

public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } else {
                map.put(c1, c2);
            }

            if (reverse.containsKey(c2)) {
                if (reverse.get(c2) != c1)
                    return false;
            } else {
                reverse.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }
}