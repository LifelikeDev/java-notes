package com.lifelike.dev;

import java.util.*;

public class TwoDimArrayLists {

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<String>();
        ArrayList<String> veggies = new ArrayList<String>();
        ArrayList<String> products = new ArrayList<String>();
        ArrayList<ArrayList<String>> shoppingList = new ArrayList();

        drinks.add("soda");
        drinks.add("wine");
        drinks.add("milk shake");

        veggies.add("tomato");
        veggies.add("onions");
        veggies.add("carrots");
        veggies.add("cucumbers");

        products.add("oil");
        products.add("salt");
        products.add("cheese");
        products.add("bacon");

        shoppingList.add(drinks);
        shoppingList.add(veggies);
        shoppingList.add(products);


//        System.out.println(shoppingList);
//        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(1).get(3));

        // fetching the contents of shoppingList array
        for (ArrayList<String> list: shoppingList) {
            System.out.println(list);
        }


    }
}
