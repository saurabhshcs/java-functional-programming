package com.techsharezone.javafunctionalprogramming.collection;

/*
 * @created 29/03/2021 - 16:54
 * @project java-functional-programming
 * @author saurabhshcs
 */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class SimpleMap {

    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        map1.put("firstRegistrationDate", null);

        Map<String, Map<String, String>> map2 = new HashMap<>();
        map2.put("vehicleByArn", map1);

        Map<String, Map<String, Map<String, String>>> messageBody = new HashMap<>();
        messageBody.put("data", map2);


        System.out.println(getFirstRegistrationDate(messageBody).get());

    }

    private static Optional<LocalDate> getFirstRegistrationDate(final Map<String, Map<String, Map<String, String>>> messageBody) {
        return Optional.of(messageBody.get("data").get("vehicleByArn"))
                .filter(y -> Objects.nonNull(y))
                .flatMap(x -> Optional.of(x.get("firstRegistrationDate")))
                .map(firstRegDate -> {
                    return  LocalDate.parse(firstRegDate);
                })
                .or(()-> { return Optional.empty();});
    }
}
