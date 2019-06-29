package Therd;
/*
Задание 3
        Смотреть задание 2.
        В обоих классах переопределить метод toString, что бы вывод был следующим:

        Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
*/

public class Device {

    String manufacturer;

    float price;
    String serialNumber;


    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;

    }

    public Device() {
    }
}
class Monitor extends Device {

    public  int resolutionX;
    public int resolutionY;

    public Monitor(String manufacturer,float price,String serialNumber, int resolutionX, int resolutionY) {
        super.manufacturer=manufacturer;
        super.price=price;
        super.serialNumber=serialNumber;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: " + manufacturer+
                ", price - " + price +
                ", serial number - " +
                serialNumber+", resolutionX - "+resolutionX+", resolutionY - "+resolutionY;
    }
}
class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "Device: "+ manufacturer+", price - "+ price +
                ", serialNumber - "  + serialNumber;
    }
}
