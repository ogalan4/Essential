package Dop;

public class Printer1 extends Printer {
    @Override
    void print(String value) {
        System.out.println("\u001B[31m" + value + "\u001B[0m");
    }
}
