package Third;
/*
Задание 3
        Используя IDEA, создайте проект c пакетом.
        Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
*/

public class Book {
    public static void main(String[] args) {

        Autor a = new Autor();
        Title t = new Title();
        Content c = new Content();
        a.setAutor("Толстой");
        t.setTitle("Война и мир");
        c.setContent("Да, это был тот самый дуб");
        a.show();
        t.show();
        c.show();
    }
}
