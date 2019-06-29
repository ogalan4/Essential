package Therd;

/*
Задание 3
        Создайте проект, используя IntelliJ IDEA.
        Требуется: Описать класс с именем Price, содержащую следующие поля:
        · название товара;
        · название магазина, в котором продается товар;
        · стоимость товара в гривнах.
        Написать программу, выполняющую следующие действия:
        · ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны быть упорядочены в алфавитном порядке по названиям магазинов);
        · вывод на экран информации о товарах, продающихся в магазине, название которого введено с клавиатуры (если такого магазина нет, вывести исключение).
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Price arr[] = new Price[2];
        Scanner sc1 = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Введите название товара");
            Price shop = new Price();
            shop.name = sc.nextLine();
            System.out.println("Введите название магазина");
            shop.shop = sc.nextLine();
            System.out.println("Введите цену товара");
            shop.price = sc1.nextInt();
            arr[i] = shop;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Введите одно из названий магазина:  " + arr[0].shop + " , " + arr[1].shop);
        String sh = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {

            if (sh.equals(arr[i].shop)) {
                System.out.println("В магазине " + arr[i].shop + " продаются " + arr[i].name + " по цене - " + arr[i].price + " грн.");
            }
        }
        if (!(sh.equals(arr[0].shop)) & !(sh.equals(arr[1].shop))) {
            try {
                throw new Exception("Такого магазина не существует. Проверьте корректность введенных даных");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                // break;
            }
        }
    }
}



