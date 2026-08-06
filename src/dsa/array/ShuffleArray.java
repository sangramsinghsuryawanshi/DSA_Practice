package dsa.array;
/*
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array and n number of Shuffle: ");
        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter array element: ");
        for (int i = 0; i <size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Shuffle Array: "+ Arrays.toString(defArray(a,n)));
    }
    public static int[] defArray(int[] arr, int n){
        int[] s = new int[arr.length];
        int ind = 0;
        for(int i=0;i<n;i++){
            s[ind++]=arr[i];
            s[ind++]=arr[i+n];
        }
        return s;
    }
}
