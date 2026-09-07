package dsa.oops;

public class StaticBlock {
    static int number;
    static int number2;
    static {
        number = 4;
        number2 = 5 * number;
        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
    }
    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        StaticBlock staticBlock2 = new StaticBlock();
        StaticBlock staticBlock3 = new StaticBlock();

    }
}
