package dsa.infosys;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {6, 6, 6, 7, 7};
        System.out.println(majorityElement(a));
    }

    private static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}