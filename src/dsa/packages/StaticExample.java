package dsa.packages;

public class StaticExample {
    public static void main(String[] args){
        PackageExample packageExample = new PackageExample("sangram",23,34340043);
        PackageExample packageExample2 = new PackageExample("Sam",23,34344003);
        PackageExample packageExample3 = new PackageExample("sam",223,3400343);
        System.out.println(PackageExample.population);
        System.out.println(PackageExample.population);
        System.out.println(PackageExample.population);
    }
}
