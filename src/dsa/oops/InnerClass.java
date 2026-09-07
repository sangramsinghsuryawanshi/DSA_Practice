package dsa.oops;

public class InnerClass {
    static class InnerClass1 {
        static String name;

        public InnerClass1(String name) {
            InnerClass1.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass1 n = new InnerClass1("d");
        InnerClass1 innerClass1 = new InnerClass1("a");
        System.out.println(n.name);
        System.out.println(innerClass1.name);
    }
}
