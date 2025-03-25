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

        //remove a string from the list
        names.remove("Luke");
        System.out.println(names + " -- Luke was removed");

        names.remove("Leia");
        System.out.println(names + " -- only removes the first instance of a dup value");

        //you can also removes values using index's
        names.remove(1);
        System.out.println(names + " -- removes the dup Leia");

        names.add("Luke");
        names.add("Leia");

        //Accessing list values
        // you use <name>.get
        System.out.println("The secret children of Darth Vader:" + names.get(2) + " and " + names.get(1));



    }
}