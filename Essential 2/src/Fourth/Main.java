package Fourth;
/*
Задание 4
        Используя Intelij IDEA создать проект, пакет.
        (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
        Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
        Перегрузить конструкторы вызывая конструктор из конструктора.
        Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
*/

public class Main {
    public static void main(String[] args) {
        Car c=new Car(1,2,3,"dark");
        Car c1=new  Car(2,3,4);
        Car c2=new Car(3,4);
        Car c3=new Car(c1.year);

    }
}