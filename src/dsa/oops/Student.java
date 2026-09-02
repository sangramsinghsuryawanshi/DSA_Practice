package dsa.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Student {
    public static void main(String[] args) {
        Xyz xyz = new Xyz();
        xyz.value=0.4;
        xyz.anInt=2;
        xyz.name="s";
        Xyz[] x1 = new Xyz[5];
        System.out.println(Arrays.toString(x1)+" "+xyz.toString());
        MyArrayList<Xyz> mylist = new MyArrayList<Xyz>();
        System.out.println(mylist.toString());
        this.toString();
    }

}

class Xyz {
    int anInt;
    double value;
    String name;

    @Override
    public String toString() {
        return anInt+" "+name+" "+this.value;
    }
}
class MyArrayList<E> extends ArrayList<E> {
}
