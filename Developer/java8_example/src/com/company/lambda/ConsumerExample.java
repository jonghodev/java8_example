package com.company.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsumerExample {

    public static void run() {
        List<String> listExample = new ArrayList();
        listExample.add("q");
        listExample.add("w");
        listExample.add("");
        listExample.add("r");

        Consumer<String> consumer = (String i) -> System.out.println(i);
        forEach(listExample, consumer);
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        list
                .stream()
                .forEach((item) -> consumer.accept(item));
    }
}
