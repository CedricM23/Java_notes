package org.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //init lists
        List<String> names = new ArrayList<>();
        List<LocalDate> dates = new ArrayList<LocalDate>();
        List<Integer> amounts = new ArrayList<>();
        List<String> test = new ArrayList<>(Arrays.asList("Luka", "Leia", "Han"));

        // list index starts at 0

        //add a string to the list
        names.add("Luke");
        names.add("Leia");
        names.add("Han");
        names.add("Leia");
        System.out.println(names);
        System.out.println("");

        //remove a string from the list
        names.remove("Luke");
        System.out.println(names + " -- Luke was removed");
        System.out.println("");

        names.remove("Leia");
        System.out.println(names + " -- only removes the first instance of a dup value");
        System.out.println("");

        //you can also removes values using index's
        names.remove(1);
        System.out.println(names + " -- removes the dup Leia");
        System.out.println("");

        names.add("Luke");
        names.add("Leia");

        //Accessing list values
        // you use <name>.get
        System.out.println("The secret children of Darth Vader:" + names.get(2) + " and " + names.get(1));
        System.out.println("");

        System.out.println("**********ForEach Loop**********");
        //Iterating through the collection
        //forEach does not access indexes
        //Straightforward syntax
        //Only can move forward from the first item
        //Every item is retrieved
        //Unknown position in the collection—you don't have access to the index
        //Can't access neighboring items

        for (String name: names){
            System.out.println("Character: " + name);
        }
        System.out.println("");


        System.out.println("**********For loop**********");
        //to access index's you need to use a for loop
        //Difficult syntax
        //Start and end where you want, and can go in reverse direction
        //Your choice to retrieve every item, every other item, every third item, etc.
        //Known position in the collection
        //Can access neighboring items or any item in the collection
        for (int i=0;i< names.size();i++){
            System.out.println("name index: " + i + " -- " + names.get(i));
        }
        System.out.println("");
    }
}