package com.techsharezone.javafunctionalprogramming.collection;

/*
 * @created 29/03/2021 - 16:54
 * @project java-functional-programming
 * @author saurabhshcs
 */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SimpleMap {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("firstRegDate", "29-03-2021");

        Map<String, Map> map = new HashMap<>();
        map.put("data", map1);

        Optional.of(map.get("data")).get("firstRegDate");

    }
}
