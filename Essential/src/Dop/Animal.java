package Dop;
/*
Задание
        Используя Intelij IDEA создать проект, пакет.
        Создать класс Animal с именем String, возрастом int, хвостом Boolean. В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет».
В классе Animal переопределить методы equals & hashCode.

*/

public class Animal {
    public static void main(String[] args) {
        Animal a=new Animal("Васька", 12,true);
        System.out.println(a);
    }
String name;
int age;
Boolean tail;
String v;
    public Animal(String name,int age,Boolean tail) {
        this.name = name;
        this.age=age;
        this.tail=tail;
if (tail==true){v="есть";}else v="нет";
    }

    @Override
    public String toString() {
        return "Имя : " + name  +
                ", возраст : " + age +
                ", хвост : " +v;
    }
}

