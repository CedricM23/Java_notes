package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Stacks {
    public static void main(String[] args) {

        //Instantiating a new stack
        Stack<String> names = new Stack<>();
        //Strings are LIFO: last in, first out.

        //A commonly used analogy is a stack of dinner trays. Adding or removing trays is only possible at the top.

        Stack<LocalDate> schedule = new Stack<LocalDate>();
        Stack<Integer> sequence = new Stack<Integer>();


        System.out.println("***** .push *****");
        //Stacks use a push() method instead of add(). The push() method adds an item to the top of the Stack.
        names.push("C3PO");
        names.push("R2-D2");
        names.push("BB-8");
        System.out.println(names);
        System.out.println("");



        //The method for removing items is pop(). This always removes the latest item from the top of the stack.
        System.out.println("*****Pop()*****");
        names.pop();
        System.out.println(names);
        System.out.println("");

        //you can check the next item without removing it by using Peek.
        System.out.println("*****ForEach Loop*****");
        String peekName = names.peek();

        for (String name : names){
            System.out.println(names);
        }

        //if you want to modify a loop you can use a for loop or a while loop. Here we use a while loop:

        names.push("BB-8");
        names.push("1");
        System.out.println("");

        System.out.println("*****While loop*****");

        while(!names.isEmpty()){
            names.pop();
            System.out.println(names);
        }

    }
}