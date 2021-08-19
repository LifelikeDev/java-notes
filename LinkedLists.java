package com.lifelike.dev;
import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

    /*  LinkedLists  -  data structure that stores nodes in 2 parts, ie. data and address
                        nodes are found in non-consecutive memory locations
                        elements are linked to each other using pointers

                        Advantages???
                            - dynamic data structure, ie. allocates needed memory while running
                            - insertion and deletion of nodes is simple ie. O(1)
                            - no/low memory waste

                        Disadvantages???
                            - greater memory usage ie. for additional pointers
                            - no random access of elements via index
                            - accessing/searching for elements is expensive ie. O(n)

                        Uses???
                            - for implementing stacks and queues
                            - GPS navigation
                            - music playlist
    */

        // Implementing linked list as a Stack (First In, Last Out)
        LinkedList<String> linkedListOne = new LinkedList<String>();

            // populating the list with elements
        linkedListOne.push("A");
        linkedListOne.push("B");
        linkedListOne.push("C");
        linkedListOne.push("D");
        linkedListOne.push("F");
            // removing elements
        linkedListOne.pop();
        System.out.println(linkedListOne); // returns [F, D, C, B, A]


        // Implementing linked list as a Queue (First In, First Out)
        LinkedList<String> linkedListTwo = new LinkedList<String>();

            // populating the list with elements
        linkedListTwo.offer("1");
        linkedListTwo.offer("2");
        linkedListTwo.offer("3");
        linkedListTwo.offer("4");
        linkedListTwo.offer("5");
        linkedListTwo.offer("7");
            // inserting elements at a specified index
        linkedListTwo.add(5, "6");
            // add method (with no specified index) inserts an element to the tail of the list
        linkedListTwo.add("0");
            // removing element from the list
            // pop() removes the head element (FIFO)
        linkedListTwo.poll();
            // other methods available on linked lists as queues
        linkedListTwo.addFirst("-1");
        System.out.println(linkedListTwo.peekFirst());
        System.out.println(linkedListTwo.peekLast());
            // remove() method removes the head of the list
        linkedListTwo.remove();

        System.out.println(linkedListTwo); // returns [1, 2, 3, 4, 5, 6, 7]

    }
}
