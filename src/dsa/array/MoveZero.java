package dsa.array;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int a[] ={0,4,0,7,0,6,4,0};
        int b[] = {0};
        System.out.println(Arrays.toString(moverZero(a)));
        System.out.println(Arrays.toString(moverZero(b)));
    }
    private static int[] moverZero(int a[]){
        int left = 0;
        for (int i=0;i<a.length;i++){
            if(a[i]>0){
                int temp = a[left];
                a[left] = a[i];
                a[i] = temp;
                left++;
            }
        }
        return a;
    }
}
