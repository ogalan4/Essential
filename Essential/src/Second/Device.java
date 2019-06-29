package Second;
/*
Задание 2
        Создать классы:
        1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
        2) Сабкалсс  Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
        Добавить методы доступа. Конструктор.
*/

public class Device {
   private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Device() {
         }

    float price;
    String serialNumber;
}
class Monitor extends Device{
    public Monitor( int resolutionX, int resolutionY) {
                this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    int resolutionX;
    int resolutionY;
}
class EthernetAdapter extends Device{
    int speed;
    String mac;

    public EthernetAdapter(int speed, String mac) {
                this.speed = speed;
        this.mac = mac;
    }
}
