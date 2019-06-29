package Fourth;
/*
Задание 4
        Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop)
*/

public class Main {
    public static void main(String[] args) {
Computr c=new Computr();
        for (int i = 0; i <c.getComputers().length ; i++) {
          Computr ci=new Computr();
            System.out.println(ci);
          c.setComputers(ci.Computers);
    }
}}
