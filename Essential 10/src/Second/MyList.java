package Second;
/*
Задание 2
        Создайте проект, используя IntelliJ IDEA.
        Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления элемента, индексатор для получения значения элемента по указанному индексу и свойство только для чтения для получения общего количества элементов.
*/

public class MyList<T> {
    int  index =0;
   private int size;
    T element;
    public T[] array;

    public void addElement(int index, T element){
this.element=element;
        array[index]=element;
index++;
size++;
    }

    public T getElement(int index){
      this.index=index;
    return array[index];}

    public int getSize() {
        return size;
    }
}
