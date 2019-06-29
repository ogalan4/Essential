package Fourth;
/*
Задание 4
        Используя Intelij IDEA создать проект, пакет.
        Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        System.out.println("Содержимое массива:");
        for (int i = 0; i <4 ; i++) {
            arr.add(i);
            System.out.println(i);
        }
        System.out.println("Содержимое увеличенного массива:");
        Iterator<Integer>it=arr.iterator();
        while (it.hasNext()){
            Integer i=it.next();
            i++;
            System.out.println(i);
        }

        }
        }


