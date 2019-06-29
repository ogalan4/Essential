package Second;

public class Main {
    public static void main(String[] args) {
        Device d=new EthernetAdapter(23,"sd45");
        System.out.println(d.serialNumber);
    }
}
