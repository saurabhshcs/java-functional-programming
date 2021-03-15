package com.techsharezone.javafunctionalprogramming.functionalinterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExample01 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 3, 5, 6, 7, 8);

        Predicate<Integer> predicateLambda = x -> x%2==0;

        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };

        Function<Integer, Integer> functionLambda = x-> x *x;

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        Consumer<Integer> consumerLambda = System.out::println;

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        };

        //Using PredicateLambda
        numbers.stream()
                .filter(predicateLambda)
                .map(functionLambda)
                .forEach(consumerLambda);

        //Using PredicateLambda
        numbers.stream()
                .filter(predicate)
                .map(function)
                .forEach(consumer);

        //Using pure lambda expression
        numbers.stream()
                .filter(x -> x%2 ==0)
                .map(x -> x *x)
                .forEach(System.out::println);

        //Using FunctionLambda
        numbers.stream()
                .map(functionLambda)
                .forEach(System.out::print);

        //Using function
        numbers.stream()
                .map(function)
                .forEach(System.out::println);

        //Using Pure Lambda
        numbers.stream()
                .map(x -> x*x)
                .forEach(System.out::println);


    }
}
