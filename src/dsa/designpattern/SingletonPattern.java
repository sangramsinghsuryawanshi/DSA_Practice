package dsa.designpattern;

public class SingletonPattern {
    private static SingletonPattern instance;;
    private SingletonPattern(){}
    public static SingletonPattern getSingletonInstance(){
        if(instance == null){
            instance = new SingletonPattern();
        }
        return instance;
    }
    public void sayHello(){
        System.out.println("Hello World");
    }
}
