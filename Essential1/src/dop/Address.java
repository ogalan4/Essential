package dop;//Задание
//      Используя IDEA, создайте проект c пакетом.
//    Требуется: Создать класс с именем dop.Address. В теле класса требуется создать поля: index, country, city, street, //house, apartment.
//     Для каждого поля, создать метод с двумя методами доступа (get, set)
//   Создать экземпляр класса dop.Address.
// В поля экземпляра записать информацию о почтовом адресе.
//Выведите на экран значения полей, описывающих адрес.

public class Address {
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    int index,house;
    String country,city,street;
}
