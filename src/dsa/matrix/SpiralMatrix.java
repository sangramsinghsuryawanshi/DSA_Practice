package dsa.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int a[][] ={{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(spiralMatrix(a));
    }
    private static List<Integer> spiralMatrix(int[][] a){
        List<Integer> l = new ArrayList<>();
        int left = 0,top=0;
        int right = a.length-1,bottom = a.length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                l.add(a[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                l.add(a[i][right]);
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >=left ; i--) {
                    l.add(a[bottom][i]);
                }
                bottom--;
            }
            if (left<=right){
                for (int i =bottom; i >=top ; i--) {
                    l.add(a[i][left]);
                }
                left++;
            }
        }
    return l;
    }
}
