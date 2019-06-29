package Second;
/*
Задание 2
        Создайте проект, используя IntelliJ IDEA.

        Требуется:
        Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
*/

public class Main {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        v1.print();
        Vehicle.Wheel w1=new Vehicle().new Wheel();
        w1.print();
        Vehicle.Door D1=new  Vehicle().new Door();
        D1.print();
    }
}
