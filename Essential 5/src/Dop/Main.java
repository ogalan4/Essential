package Dop;
/*
Задание
        Используя Intelij IDEA создать проект, пакет.
        Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<>();
        arr.add("Иванов");
        arr.add("Петров");
        arr.add("Сидоров");
        arr.add("Гаркавий");
        arr.add("Никонов");
        System.out.println("Лучший преподаватель - "+" "+arr.get(2));
        System.out.println("Худший преподаватель - "+" "+arr.get(4));
       /*for (String a:arr){
            System.out.println(a);
        }*/
    }}