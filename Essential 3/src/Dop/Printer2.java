package Dop;

public class Printer2 extends Printer {
    @Override
    void print(String value) {
        System.out.println("\u001B[35m" + value + "\u001B[0m");
    }
}
