package dsa.string;

import java.util.*;

public class GroupAnagrams {


    public static List<List<String>> groupAnagramsOptimized(String[] words) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        List<List<String>> ans = new LinkedList<>();
        TreeSet<String> set = new TreeSet<>();
        List<String> list1 = sortString(words);
        boolean[] visited = new boolean[words.length];
        for (int i = 0; i < list1.size(); i++) {
            if (visited[i]) continue;
            List<String> list2 = new ArrayList<>();
            list2.add(words[i]);
            visited[i] = true;
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i).equals(list1.get(j))) {
                    list2.add(words[j]);
                    visited[j] = true;
                }
            }
            ans.add(list2);
        }
        return ans;
    }

    private static List<String> sortString(String[] words) {
        LinkedList<String> list = new LinkedList<>();
        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            list.add(new String(arr));
        }
        return list;
    }

    public static void main(String[] args) {

        String[] words = {
                "eat", "tea", "tan", "ate", "nat", "bat"
        };
        String[] words1 = {
                "ere", "ere", "dfd", "ere", "dfd", "sss"
        };
        String[] words2 = {
                "wwe", "sds", "ten", "dfs", "sf", "df"
        };

        long start = System.nanoTime();
        System.out.println(groupAnagrams(words));
        System.out.println(groupAnagrams(words1));
        System.out.println(groupAnagrams(words2));
        long end = System.nanoTime();
        long start2 = System.nanoTime();
        System.out.println(groupAnagramsOptimized(words));
        System.out.println(groupAnagramsOptimized(words1));
        System.out.println(groupAnagramsOptimized(words2));
        long end2 = System.nanoTime();
        System.out.println((end - start)+" "+(end2-start2));
    }
}