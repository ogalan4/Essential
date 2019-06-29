package Therd;

public class Main {
    public static void main(String[] args) {
        Monitor m=new Monitor("Samsung",123.5f,"вавр",123,456);
        EthernetAdapter e=new EthernetAdapter("Samsung",123.5f,"вавр",300,"dfggh");
        System.out.println( e.toString());
        System.out.println(m.toString());

    }
}
