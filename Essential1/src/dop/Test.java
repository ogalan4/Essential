package dop;

import dop.Address;

public class Test {
    public static void main(String[] args) {
        Address ad=new Address();
        ad.setIndex(123456789);
        int index=ad.getIndex();
        System.out.println(index);
        System.out.println(ad.getCity()+ ad.getCountry()+ ad.getStreet());
        System.out.println(ad.getHouse());
    }
}
