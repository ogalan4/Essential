package Second;

public class Worker implements Comparable<Worker> {
    String fio;
String job;
int year;

    public Worker() {

    }
    @Override
    public int compareTo(Worker o) {
        int r=this.fio.compareTo(o.fio);

    return r;}

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + fio + '\'' +
                ", занимаемая должность-'" + job + '\'' +
                ", год поступления на работу - " + year +
                '}';
    }
}
