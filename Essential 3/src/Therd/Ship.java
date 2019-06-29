package Therd;

public class Ship extends Vehicle {
    int CountOfPumps;
    String PortOfDestination;
    void show(double price,int speed,int jear,int CountOfPumps,String PortOfDestination){
        System.out.println(" цена корабля "+price+" скорость "+speed+" год выпуска "+jear+" колличество пассажиров "+CountOfPumps+" порт назначения "+PortOfDestination);
    }
}
