package dsa.packages;
import dsa.oops.WrapperClass;

public class PackageExample extends WrapperClass {
    String name;
    int age;
    int salary;
    static int population;
    public PackageExample(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        PackageExample.population +=1;
    }
    public static void population() {
        PackageExample.number = 0;
    }
}
