package Therd;

/*
Задание 3
        Создайте проект, используя IntelliJ IDEA.

        Требуется:
        Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы измерения (к примеру, из метров в километры, из километров в мили, и так далее).
*/

public class Distance {
    static double distance;
    void print(){
        System.out.println(distance+ " метров");
    }
    static class Converter{
        void convertToKilometer(){
            System.out.println("Расстояние в "+distance+" равно "+distance/1000+" километров");
        }
        void converterToMiles(){
            System.out.println("Расстояние в "+distance+" равно "+distance/1700+" миль");
        }
        void converterToDecimeter(){
            System.out.println("Расстояние в "+distance+" равно "+distance*10+" дециметров");
        }
    }
}
