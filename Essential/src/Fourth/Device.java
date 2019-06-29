package Fourth;

import java.util.Objects;

public class Device {
 String manufacturer;

    float price;
    String serialNumber;
    public Device(String manufacturer,float price,String serialNumber) {
    }

    public Device() {

    }
}
class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer,float price,String serialNumber, int resolutionX, int resolutionY) {
        super.manufacturer=manufacturer;
        super.price=price;
        super.serialNumber=serialNumber;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionX, resolutionY);
    }
}
class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(String manufacturer,float price,String serialNumber,int speed, String mac) {
        super.manufacturer=manufacturer;
        super.price=price;
        super.serialNumber=serialNumber;
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed &&
                Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, mac);
    }
}
