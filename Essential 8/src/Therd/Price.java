package Therd;

public class Price implements Comparable<Price> {
    String name;
    String shop;
    int price;

    public Price() {

    }
    @Override
    public int compareTo(Price o) {
        int r=shop.compareTo(o.shop);
        return r;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", shop='" + shop + '\'' +
                ", price=" + price +
                '}';
    }
}
