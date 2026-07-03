package dsa.basics;

class GCDOfNum {
    public static int isGCD1(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int isGCD2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return isGCD2(b, a % b);
    }

    public static void main(String[] ar) {
        int a = 8, b = 8;
        System.out.println(isGCD1(a, b));
        System.out.println(isGCD2(a, b));
    }
}
