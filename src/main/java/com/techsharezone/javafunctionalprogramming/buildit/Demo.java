package com.techsharezone.javafunctionalprogramming.buildit;

/*
 * @created 13/07/2021 - 17:16
 * @project java-functional-programming
 * @author saurabhshcs
 */

import org.apache.logging.log4j.util.Strings;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sam", "Galaxy", "Gal");

        System.out.println(String.format("registrationNumber in (%s)", Strings.join(names, ',')));
        System.out.println(String.format("names in (%s)", names));

    }
}
