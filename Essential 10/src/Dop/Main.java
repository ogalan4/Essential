package Dop;

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> m=new MyClass<>();
        System.out.println(m.factoryMethod().getClass());
    }
}
