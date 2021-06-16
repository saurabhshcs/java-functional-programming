package com.techsharezone.javafunctionalprogramming.functionalinterface.random;

/*
 * @created 16/06/2021 -23:49
 * @project java-functional-programming
 * @author  saurabhshcs
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HigherOrderFunctionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Saurabh", "James", "Galaxie", "Ivy", "Ibrahim", "Izna", "Kashish");

        /*
         * The Collection.sort() takes two parameters. The first parameter is a List and second parameter is a lambda (function).
         * The lambda parameter is what makes Collections.sort() a higher order function.
         * */

        Collections.sort(names, (String a, String b) -> {
            return a.compareTo(b);
        });

        System.out.println(names);
    }
}
