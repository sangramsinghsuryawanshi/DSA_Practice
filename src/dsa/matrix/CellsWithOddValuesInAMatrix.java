package dsa.matrix;
import java.util.Arrays;
import java.util.Scanner;
public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values: ");
        int m = 2;
        int n = 3;
        System.out.println("Enter indices: ");
        int [][] ind = {{0,1},{1,1}};
        System.out.println(Arrays.deepToString(oddCell(m,n,ind)));
    }
    private static int[][] oddCell(int m, int n, int[][] ind){
        int ans[][] = new int[m][n];
        for(int[] a:ind) {
            int n1 = a[0];
            int n2 = a[1];
            for (int i = 0; i < n; i++) {
                ans[n1][i]++;
            }
            for (int i = 0; i < m; i++) {
                ans[i][n2]++;
            }
        }
        return ans;
    }
}
