package dsa.oops;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        System.out.println(a+" "+b);
        swap(a,b);
    }
    public static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}
