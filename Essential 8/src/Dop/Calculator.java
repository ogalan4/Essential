package Dop;
/*
Задание
        Создайте проект, используя IntelliJ IDEA.

        Создайте класс Calculator.
        В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание, mul – умножение, div – деление).
        Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать исключение.
        Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При возникновении ошибок должны выбрасываться исключения.
*/


public class Calculator {

    public void Sum(double a, double b) {
        System.out.println(a + b);
    }

    public void Rec(double a, double b) {
        System.out.println(a - b);
    }

    public void Mul(double a, double b) {
        System.out.println(a * b);
    }

    public void Div(int a, int b) {
              try {
a=a/b;
            System.out.println(a );

        }catch (Exception e){
                    System.out.println("Вы пытаетесь произвести деление на 0");
                    System.out.println(e.getMessage());
                }
    }
}