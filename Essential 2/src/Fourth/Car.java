package Fourth;

public class Car {
int year=2000;
double speed=100;
int weiht=1000;
String color="red";
public Car(){
    }

    public Car(int year) {
        this.year = year;
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);

    }
    public Car(int year, double speed, int weiht, String color) {
        this.year = year;
        this.speed = speed;
        this.weiht = weiht;
        this.color = color;
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);
    }

    public Car(int year, double speed, int weiht) {
        this.year = year;
        this.speed = speed;
        this.weiht = weiht;
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);
}

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        System.out.println("год"+" "+year+"вес"+" "+weiht+"скорость"+" "+speed+"цвет"+" "+color);
}

}
