package Therd;

public class Car {
    int year=1990;
    int weiht=1300;
    double speed=120;
    String color="blue";
    public Car(){
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);
    }

    public Car(int year) {
        this.year = year;
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);
    }

    public Car(int year, int weiht) {
        this.year = year;
        this.weiht = weiht;
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);
    }

    public Car(int year, int weiht, double speed) {
        this.year = year;
        this.weiht = weiht;
        this.speed = speed;
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);
    }

    public Car(int year, int weiht, double speed, String color) {
        this.year = year;
        this.weiht = weiht;
        this.speed = speed;
        this.color = color;
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);
    }
}
