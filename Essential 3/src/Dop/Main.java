package Dop;

/*
Задание
        Используя IntelliJ IDEA, создайте проект.
        Требуется:
        Создайте класс Printer.
        В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
        Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов, выводились разными цветами.
        Обязательно используйте приведение типов.
*/
public class Main {
    public static void main(String[] args) {
       /* final String reset="\u001B[0m";
        final String black="\u001B[30m";
        final String red="\u001B[31m";
        final String green="\u001B[32m";
        final String yellow="\u001B[33m";
        final String blue="\u001B[34m";
        final String purple="\u001B[35m";
        final String cyan="\u001B[36m";
        final String white="\u001B[37m";*/
        Printer p = new Printer();
        p.print("Hallo!!!!!");
        Printer1 p1 = new Printer1();
        p1.print("Hallo!!!!!");
        Printer2 p2 = new Printer2();
        p2.print("Hallo!!!!!");
        Printer3 p3 = new Printer3();
        p3.print("World!!!");
    }
}
