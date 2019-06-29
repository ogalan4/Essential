package Fourth;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument(){
        System.out.println("Документ сохранен в новом формате");
    }

}
