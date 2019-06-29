package Dop;

public enum Vehicles {
    Audi(200){
              public String getColor() {
            return "зеленый";
        }}
,   BMW(300){
              public String getColor() {
            return "желтый";
        }},
    Ford(400){
    public String getColor(){
            return "зеленый";
        }},
    Fiat(500){
        public String getColor() {
            return "зеленый";
        }};

  /*  public double getPrice() {
        return price;
    }
*/
    double price;

    public String getColor() {
        return color;
    }

    private String color;

    Vehicles(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Модель - "+ super.toString()+" цена - "+price+" цвет - "+getColor();
    }}

