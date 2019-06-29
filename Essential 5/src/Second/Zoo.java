package Second;
/*
Задание 2
        Используя Intelij IDEA создать проект, пакет.
        Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
        Вывести список в консоль.
*/

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
arr.add(0,"Cat");
arr.add(1,"Dog");
arr.add(2,"Cow");
arr.add(3,"Lion");
arr.add(4,"Tiger");
arr.add(5,"Monkey");
arr.add(6,"Ship");
for (String a:arr){
    System.out.println(a);
}
    }
}
