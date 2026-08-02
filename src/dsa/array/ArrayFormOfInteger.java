package dsa.array;

import java.util.*;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int digit : num) {
            sb.append(digit);
        }
        String s = sb.toString();
        int temp =  Integer.parseInt(s) + k;
        while(temp!=0){
            int rem = temp%10;
            l.add(rem);
            temp/=10;
        }
        Collections.reverse(l);
        System.out.println(l);
    }
}
