package dsa.collection;

import java.util.*;

public class FindDuplicates {

    public static void findDuplicates1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    cnt++;
                }
            }
            if (arr[i] != -1 && cnt > 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 5, 1};

        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean found = false;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicates");
        }
    }
}
