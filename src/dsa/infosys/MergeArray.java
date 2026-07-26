package dsa.infosys;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] ar) {
        int a[] = {0};
        int b[] = {1};
        int m = 0, n = 1;
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                a[k] = a[i];
                i--;
            } else {
                a[k] = b[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            a[k] = b[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(a));
    }
}
