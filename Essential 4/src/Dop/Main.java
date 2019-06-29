package Dop;
/*
Задание
        Используя IntelliJ IDEA, создайте проект. Требуется:
        Создать абстрактный Shape, в котором содержится один абстрактный метод void draw().
        Создайте 2 производных класса Circle, Rectangle, которые реализую метод void draw() и выводят свои сообщение – “Круг”, “Прямоугольник”.
        В классе Main создать объекты классов Circle, Rectangle через родительский класс( полиморфная ссылка) и вызвать их методы
*/

public class Main {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.drow();
        Rectangle r=new Rectangle();
        r.drow();

    }
}
