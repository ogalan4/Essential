package Dop;

/*
Задание

        Создайте проект, используя IntelliJ IDEA.

        Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать строку с названием экземпляра, цветом и  стоимостью автомобиля.
*/

public class Main {
    public static void main(String[] args) {
Vehicles v=Vehicles.Audi;
        System.out.println(v);
        Vehicles v1=Vehicles.BMW;
        System.out.println(v1);
        Vehicles v2=Vehicles.Fiat;
        System.out.println(v2);
    Vehicles v3=Vehicles.Ford;
        System.out.println(v3);
    }
}
