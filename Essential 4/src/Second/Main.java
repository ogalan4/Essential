package Second;
/*
Задание 2
        Используя IntelliJ IDEA, создайте проект. Требуется:
        Создайте абстрактный класс AbstractHandler.
        В теле класса создать абстрактные методы void open(), void create(), void change(), void save().
        Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
        Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы открытия, создания, редактирования, сохранения определенного формата документа.
*/

public class Main {
    public static void main(String[] args) {
             String Handler="DOC";
             if (Handler=="XML") {
                 XMLHandler a1 = new XMLHandler();
                 a1.open();
                 a1.create();
                 a1.Change();
                 a1.save();
             }else if (Handler=="DOC"){
                DOCHandler d=new DOCHandler();
                d.open();
                d.create();
                d.Change();
                d.save();}
                else {
    TXTHandler t=new TXTHandler();
    t.open();
    t.create();
    t.Change();
    t.save();
    }}
}
