package Second;
/*
Задание 2
        Создайте проект, используя IntelliJ IDEA.

        Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который должен возвращать название экземпляра и возраст животного.
*/

public class Main {
    public static void main(String[] args) {
        Animals a=Animals.Cat;
        System.out.println(a);
        Animals a1=Animals.Cow;
        System.out.println(a1);
        Animals a2=Animals.Dog;
        System.out.println(a2);
        Animals a3=Animals.Lion;
        System.out.println(a3);

    }
}
