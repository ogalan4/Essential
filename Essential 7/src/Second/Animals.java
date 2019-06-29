package Second;

public enum Animals {Dog(5),Cat(9),Cow(4),Lion(6);

    public int getAge() {
        return age;
    }

    int age;
Animals(int age){
    this.age=age;
}
@Override
public String toString(){
    return "Животное - "+ super.toString()+" возраст -"+getAge();}
}
