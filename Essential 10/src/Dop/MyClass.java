package Dop;
/*
Задание
        Создайте проект, используя IntelliJ IDEA.
        Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения типом – Т).
*/

public class MyClass<T> {
    public T field;
    MyClass<T> factoryMethod() {
     return new MyClass<T>();

    }
        }