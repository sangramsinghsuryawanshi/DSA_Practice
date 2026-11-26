package dsa.collection;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int a[] = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        System.out.println(subarraySum(a, k));
        System.out.println(subarraySum2(a, k));
    }

    private static int subarraySum(int[] a, int k) {
        if (a == null || a.length == 0) return 0;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += a[l];
                }
                if (sum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static int subarraySum2(int[] a, int k) {

        if (a == null || a.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];

            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }

}
