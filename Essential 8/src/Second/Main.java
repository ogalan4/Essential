package Second;
/*
Задание 2
        Создайте проект, используя IntelliJ IDEA.
        Требуется:
        Описать класс с именем Worker, содержащую следующие поля:
        · фамилия и инициалы работника;
        · название занимаемой должности;
        · год поступления на работу.
        Написать программу, выполняющую следующие действия:
        · ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны быть упорядочены по алфавиту);
        · если значение года введено не в соответствующем формате выдает исключение.
        · вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
*/

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int TimeOfWork = 15;
        Scanner sc = new Scanner(System.in);
        Worker arr[] = new Worker[3];
        for (int i = 0; i < 3; i++) {
            Worker w = new Worker();
            System.out.println("Введите ФИО сотрудника");
            w.fio = sc.nextLine();
            System.out.println("Введите занимаемую должность");
            w.job = sc.nextLine();
            System.out.println("Введите год поступления на работу");
            Scanner sc1 = new Scanner(System.in);
            if (sc1.hasNextInt()) {
                w.year = sc1.nextInt();
                if (w.year > TimeOfWork) {
                    System.out.println(w.fio + "  имеет стаж работы больше 15 лет");
                }
                arr[i] = w;
            } else {
                try {
                    throw new IOException("Неправильный формат");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Введите еще раз");
                }
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));//Вывод на экран несортерованого массива
        Arrays.sort(arr);  //Сортировка массива
        System.out.println(Arrays.toString(arr));//Вывод на экран сортированого массива
    }
}
