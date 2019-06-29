package adc;

public enum Vehicles {Audi(100){
    @Override
    public String getColor() {
        return "red";
    }
},
    BMV(200){
        @Override
        public String getColor() {
            return "yellow";
        }
    },
    Amg(300){
        @Override
        public String getColor() {
            return "blue";
        }
    },
    Toyota(400){
        @Override
        public String getColor() {
            return "black";
        }
    };

    /*public int getPrice() {
        return price;
    }
*/
    public String getColor() {
        return color;
    }

    int price;
String color;
Vehicles(int price){
    this.price=price;
}

    @Override
    public String toString() {
        return "Vehicles " +super.toString()+
                " {price=" + price +
                ", color='" + getColor() + '\'' +
                '}';
    }
}

