package dsa.array;

public class FloorNumber {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 8, 9, 10, 12, 13, 14, 90, 101};
        int start = 0, end = a.length - 1;
        int k = 13;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == k) {
                System.out.println("Floor = " + a[mid]);
                System.out.println("Ceiling = " + a[mid]);
                return;
            } else if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(a[start] + " : " + a[end]);
    }
}
