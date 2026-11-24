package dsa.array;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size of the array: ");
            int n=sc.nextInt();
            int[] a=new int[n];
            System.out.print("Enter the elements of the array: ");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.print("The missing number in the array is: "+findMissingNumber(a));
        }
    }
    public static int findMissingNumber(int[] a){
        int n = a.length + 1;
        int expSum = n * (n+1)/2;
        int sum=0;
        for (int j : a) {
            sum += j;
        }
        int ans=expSum-sum;
        return (ans <= 0)? -1 : ans;
    }
}
