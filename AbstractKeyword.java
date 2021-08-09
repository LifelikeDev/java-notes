package com.lifelike.dev;

public class AbstractKeyword {

    public static void main(String[] args) {
        /* abstract  -  of classes and methods
                        * classes * cannot be instantiated themselves, but
                        can have subclasses which can be instantiated
                        * methods * are declared without an implementation (a body), but
                        a subclass has to implement the method within it
         */

        Product iPhone = new Product("Apple Inc", 100000000,
                                "iPhone 11");

        iPhone.popularity();

        // code below not possible due to the class' possession of the abstract modifier
        // CompanyName apple = new CompanyName();

    }

}

abstract class CompanyName {
    String companyName;
    int companyWorth;

    CompanyName(String companyName, int companyWorth) {
        this.companyName = companyName;
        this.companyWorth = companyWorth;
    }

    abstract void popularity();
}

class Product extends CompanyName {
    String productName;

    Product(String companyName, int companyWorth, String productName) {
        super(companyName, companyWorth);
        this.productName = productName;
    }

    // implementation (overriding) of the abstract method in the super-class
    @Override
    void popularity() {
        System.out.println("iPhone 11 was the next big iPhone before iPhone 12");
    }
}