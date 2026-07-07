package dsa.collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list =  new ArrayList<>();

        list.add(new ArrayList<>());
        System.out.println(list);
        System.nanoTime();
    }
}
