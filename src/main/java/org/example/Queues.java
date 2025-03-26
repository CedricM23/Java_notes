package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Queues {
    public static void main(String[] args) {

        //Instantiating a new Queue
        Queue<String> names = new LinkedList<String>();
        //A Queue is an "ordered" First-In First-Out (FIFO) data structure.
        // New items are added at the end of the collection, and existing items are pulled from the beginning.
        Queue<LocalDate> schedule = new LinkedList<LocalDate>();

        //Adding items to a Queue
        //you use the offer() method to add an item to the end of the Queue
        System.out.println("Adding an item");
        names.offer("C3PO");
        names.offer("R2-D2");
        names.offer("BB-8");
        System.out.println(names);
        System.out.println("");

        System.out.println("Removing an item");
        //Removing items from a Queue
        String name = names.poll();
        // to see the items you removed you can do this:

        System.out.println(name + " -- was removed");
        System.out.println(names);
        System.out.println("");

        //looping through a queue

        System.out.println("**** While Loop ****");
        while (!names.isEmpty()){
            names.poll();
            System.out.println(names);
        }





    }
}