
package dsa.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int longestUniqueSubstring(String str) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            // Remove duplicate characters
            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }

            // Add current character
            set.add(ch);

            // Calculate window size
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println(longestUniqueSubstring(str));
    }
}
