package com.lifelike.dev;

public class ArrayOfObjects {

    public static void main(String[] args) {

        Vehicles benz = new Vehicles("benz");
        Vehicles volvo = new Vehicles("volvo");
        Vehicles nissan = new Vehicles("nissan");
        Vehicles toyota = new Vehicles("toyota");
        Vehicles peugeot = new Vehicles("peugeot");

//        Vehicles[] warehouse = new Vehicles[5];
//        warehouse[0] = benz;
//        warehouse[1] = volvo;
//        warehouse[2] = nissan;
//        warehouse[3] = toyota;
//        warehouse[4] = peugeot;

        // OR
        Vehicles[] warehouse = { benz, volvo, nissan, toyota, peugeot };

        System.out.println(warehouse[2].name);
        System.out.println(warehouse[3].name);
        System.out.println(warehouse.length);

    }

}

class Vehicles {
    String name;

    Vehicles(String name) {
        this.name = name;
    }

}
