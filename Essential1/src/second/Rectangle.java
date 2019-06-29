package second;

import java.util.Scanner;

/*
Задание 2
        Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса создать два поля, описывающие длины сторон double side1, double side2. Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.
*/
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну прямоугольника");
        double side1 = sc.nextDouble();
        System.out.println("Введите ширину прямоугольника");
        double side2 = sc.nextDouble();
        Rectangle rec = new Rectangle();
        rec.areaCalculator(side1, side2);
        rec.perimeterCalculator(side1, side2);
    }
}

public class Rectangle {
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    double side1;
    double side2;

    double areaCalculator(double side1, double side2) {
        double s = side1 * side2;
        System.out.println("Площадь прямоугольника равна "+" "+s);
        return s;
    }


    double perimeterCalculator(double side1, double side2) {
        double p = 2 * (side1 + side2);
        System.out.println("Периметр прямоугольника равен"+" "+p);
        return p;
    }
}
