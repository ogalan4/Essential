package Fourth;
/*
Задание 4
        Смотреть задание 2.
        Переопределить методы equals & hashCode в каждом классе.
        Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
*/

public class Main {
    public static void main(String[] args) {
        Monitor m=new Monitor("Samsung",123,"іавіап",125,564);
        System.out.println(m.hashCode());
        System.out.println(m.equals(Monitor.class));
        EthernetAdapter e=new EthernetAdapter("Samsung",123,"іавіап",300,"ывва");
        System.out.println(e.hashCode());
        System.out.println(e.equals(EthernetAdapter.class));
    }
}
