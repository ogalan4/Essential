package Second;
/*
Задание 2
        Используя IntelliJ IDEA, создайте проект.
        Требуется:
        Создать класс, представляющий учебный класс ClassRoom.
        Создайте класс ученик Pupil.  В теле класса создайте методы void study(), void read(), void write(), void relax().
        Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и переопределите каждый из методов, в зависимости от успеваемости ученика.
        Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
        Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
        Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать, отдыхать.
*/
public class Main {
    public static void main(String[] args) {
        ClassRoom c1=new ExcelentPupil();
        ((ExcelentPupil) c1).study("excelent");
        ((ExcelentPupil) c1).read("excelent");
        ((ExcelentPupil) c1).write("excelent");
        ((ExcelentPupil) c1).relax("bad");
        ClassRoom c2=new ExcelentPupil();
        ((ExcelentPupil) c2).study("excelent");
        ((ExcelentPupil) c2).write("excelent");
        ((ExcelentPupil) c2).read("excelent");
        ((ExcelentPupil) c2).relax("bad");
        ClassRoom c3=new GoodPupil();
        ((GoodPupil) c3).study("good");
        ((GoodPupil) c3).read("good");
        ((GoodPupil) c3).write("good");
        ((GoodPupil) c3).relax("good");
        ClassRoom c4=new BadPupil();
        ((BadPupil) c4).study("bad");
        ((BadPupil) c4).read("bad");
        ((BadPupil) c4).write("bad");
        ((BadPupil) c4).relax("excelent");
    }
}
