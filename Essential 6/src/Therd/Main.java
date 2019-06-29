package Therd;

public class Main {
    public static void main(String[] args) {
        Distance d=new Distance();
        Distance.distance=6000;
        d.print();
        Distance.Converter c1=new Distance.Converter();
        c1.convertToKilometer();
        c1.converterToDecimeter();
        c1.converterToMiles();
    }
}
