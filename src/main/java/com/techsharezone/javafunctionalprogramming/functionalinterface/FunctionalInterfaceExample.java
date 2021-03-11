package com.techsharezone.javafunctionalprogramming.functionalinterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 3, 5, 6, 7, 8);
        numbers.stream()
                .filter(x->x%2==0) // Predicate - Represents a predicate (boolean-valued function) of one argument.
                .map(x -> x*x) //Function - Represents a function that accepts one argument and produces a result.
                .forEach(System.out::println); //Consumer - Represents an operation that accepts a single input argument and returns no result.
    }
}
