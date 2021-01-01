package com.company.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void run() {
        List<String> listExample = new ArrayList();
        listExample.add("q");
        listExample.add("w");
        listExample.add("");
        listExample.add("r");

        Predicate<String> predicate = (String s) -> !s.isEmpty();
        List<String> notEmptyString = filter(listExample, predicate);
        notEmptyString.stream().forEach((el) -> System.out.println(el));
    }

    public static <T> List<T> filter(List<T> list, Predicate predicate) {
        List<T> results = list
                .stream()
                .filter((item) -> predicate.test(item))
                .collect(Collectors.toList());
        return results;
    }
}
