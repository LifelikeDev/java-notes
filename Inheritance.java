package com.lifelike.dev;

public class Inheritance {

    public static void main(String[] args) {

        // inheritance - the phenomenon where one class acquires the attributes
        //               and methods of another class

        iPhone proMax = new iPhone();
        System.out.println("iPhone specs...");
        System.out.println(proMax.companyName);
        System.out.println(proMax.foundingPartner);
        System.out.println(proMax.product);
        proMax.description();
        System.out.println();

        iMac iMacDesk = new iMac();
        System.out.println("iMac specs...");
        System.out.println(iMacDesk.product);
        System.out.println(iMacDesk.companyName);
        System.out.println();

        airPods airPodsNew = new airPods();
        System.out.println("airPods specs...");
        System.out.println(airPodsNew.isAnAccessory);
        System.out.println(airPodsNew.product);
        System.out.println(airPodsNew.companyName);
        airPodsNew.description();

        int airPodsMakeYear = airPodsNew.year;

        System.out.println(airPodsMakeYear);

    }

}

class Company {
    String companyName = "Apple Inc";
    String foundingPartner = "Steve Jobs";

    void majorProducts() {
        System.out.println("Inventors of iMac, iPhone, iPad, iPod, airPods, etc.");
    }

}

class iPhone extends Company {
    String product = "iPhone";
    int year = 2001;

    void description() {
        System.out.println("sleek smartphones known for luxury and high camera quality");
    }

}

class iMac extends Company {
    String product = "iMac";
    int year = 2015;

    void brief() {
        System.out.println("sleek desktop computers with high storage capacity");
    }
}

class airPods extends iPhone {
    boolean isAnAccessory = true;
    int manuYear = 2018;
}