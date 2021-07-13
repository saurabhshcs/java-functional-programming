package com.techsharezone.javafunctionalprogramming.buildit;

/*
 * @created 12/07/2021 - 00:39
 * @project java-functional-programming
 * @author saurabhshcs
 */

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzz {

    public static void main(String[] args) {
//        fizzBuzz(100);

        Map<String, Integer> agraRestaurents = new HashMap<>();
        agraRestaurents.put("agr-r1", 4);
        agraRestaurents.put("agr-r2", 3);
        agraRestaurents.put("agr-r3", 2);
        agraRestaurents.put("agr-r4", 1);

        Map<String, Integer> delhiRestaurents = new HashMap<>();
        delhiRestaurents.put("agr-r1", 4);
        delhiRestaurents.put("agr-r2", 3);
        delhiRestaurents.put("agr-r3", 2);
        delhiRestaurents.put("agr-r4", 1);

        Map<String, Integer> mumbaiRestaurents = new HashMap<>();
        mumbaiRestaurents.put("agr-r1", 4);
        mumbaiRestaurents.put("agr-r2", 3);
        mumbaiRestaurents.put("agr-r3", 2);
        mumbaiRestaurents.put("agr-r4", 1);

        Map<String, Map<String, Integer>> cityWithRestaurents = new HashMap<>();
        cityWithRestaurents.put("Agra", agraRestaurents);
        cityWithRestaurents.put("Delhi", delhiRestaurents);
        cityWithRestaurents.put("Mumbai", mumbaiRestaurents);

//        Optional<Map.Entry> maxEntry = cityWithRestaurents.entrySet().stream()
//                .max(Comparator.comparing(Map.Entry::getValue));
    }

    private static <K, V extends Comparable<V>> V maxUsingStreamAndMethodReference(Map<K, V> map) {
        Optional<Map.Entry<K, V>> maxEntry = map.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        return maxEntry.get()
                .getValue();
    }
    private static void fizzBuzz(Integer number) {

        IntStream.range(1, 100)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
