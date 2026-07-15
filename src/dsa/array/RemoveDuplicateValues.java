package dsa.array;

/*
Question 6: Remove Duplicate Elements
Requirements
Remove duplicate values.
Print only unique elements.
Input
8
2 3 5 2 3 8 9 8
Output
2 3 5 8 9
*/

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicateValues {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.println("Enter array of element: ");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int cnt = 0;
            for (int j =i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    cnt++;
                    a[j] = -1;
                }
            }
            if (a[i] != -1) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
