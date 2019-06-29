package Second;

public class GoodPupil extends Pupil {
@Override
    void study(String study){
    System.out.println("I study"+ " "+study);
}
@Override
    void read (String read){
    System.out.println("I read "+ " "+read);
}
@Override
    void write (String write){
    System.out.println("I write "+ " "+write);
}
@Override
    void relax(String relax){
    System.out.println("I relax"+" "+relax);
}
}
