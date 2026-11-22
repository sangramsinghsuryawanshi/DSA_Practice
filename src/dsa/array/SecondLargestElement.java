package dsa.array;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        try {
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The second largest element is: "+findElement(arr));
        } catch (Exception e) {
            System.out.println("Please enter a correct integer");
        }
    }
    private static int findElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }else if(arr[i] > smax && max!=arr[i]){
                smax = arr[i];
            }
        }
        return (smax == Integer.MIN_VALUE)? -1 : smax;
    }
}
