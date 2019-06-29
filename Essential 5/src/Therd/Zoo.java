package Therd;

/*
Задание 3
        Используя Intelij IDEA создать проект, пакет.
        Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
*/

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add(0,"Cat");
        arr.add(1,"Dog");
        arr.add(2,"Cow");
        arr.add(3,"Lion");
        arr.add(4,"Tiger");
        arr.add(5,"Monkey");
        arr.add(6,"Ship");
        arr.add(7,"Mouse");
for (String a:arr){
    System.out.println(a);
}
arr.remove(7);
arr.remove(5);
arr.remove(2);
        System.out.println("Размер нового массива - "+" "+arr.size());
        for (String a:arr) {
            System.out.println(a);
        }}
        }

