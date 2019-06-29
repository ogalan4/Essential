package Second;
/*
Задание 2
        Используя Intelij IDEA создать проект, пакет.
        Создать класс Машина с полями год(int), цвет(String).
        Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
        Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
*/

public class Main {
    public static void main(String[] args) {
        Car c=new Car(2003,"blue");
        Car c1=new Car(2002);
        Car c2=new Car();
    }
}
