package Dop;

public class Printer3 extends Printer {
    @Override
    void print(String value) {
        System.out.println("\u001B[36m" + value + "\u001B[0m");
    }
}
