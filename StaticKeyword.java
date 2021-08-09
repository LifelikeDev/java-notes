package com.lifelike.dev;

public class StaticKeyword {

    public static void main(String[] args) {
        /*  static keyword - modifier applicable to variables and methods
                             a member with the name belongs only to the class in which it is called
                             and none else
                             a single copy of a variable or method created and shared by the
                             entire class
                             don't need to be instantiated like other objects are
                             can be called directly in another class
        */

        Friend firstFriend = new Friend("Luke");
        System.out.println(Friend.noOfFriends);

        Friend secondFriend = new Friend("John");
        System.out.println(Friend.noOfFriends);

        // accessing the displayFriends() method directly without instantiating it
        Friend.displayFriends();

    }
}

class Friend {
    String name;
    static int noOfFriends = 10;

    Friend(String name) {
        this.name = name;
        noOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + noOfFriends + " friends in your life.");
    }

}
