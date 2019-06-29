package Therd;

public class Plane extends Vehicle {
    double heiht;
    int CountOfPumps;
    void show(double price,int speed,int jear,double heiht,int CountOfPumps){
        System.out.println(" цена "+price+" скорость "+speed+" год выпуска "+jear+" высота самолета "+heiht+" колличество пассажиров "+CountOfPumps);
    }
}
