package Second;

public class Car {
    int year=1556;
    String color="red";
public Car(){
    System.out.println(year+color);
}
    public Car(int year) {
        this.year = year;
        System.out.println(year+color);
}

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
        System.out.println(year+color);
    }
}
