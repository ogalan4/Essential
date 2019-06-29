package Dop;
/*
Задание
        Используя IntelliJ IDEA, создайте проект.
        Требуется:
        Создать класс Calculator, с методами для выполнения основных арифметических операций.
        Написать программу, которая выводит на экран основные арифметические операции.
*/

public class Calculator {
    double a,b;
    void summ(double a,double b){
        System.out.println(a+b);
    }
    void sub(double a,double b){
        System.out.println(a-b);
    }
    void mul(double a,double b){
        System.out.println(a*b);
    }
    void div(double a,double b){
        System.out.println(a/b);
    }
}
