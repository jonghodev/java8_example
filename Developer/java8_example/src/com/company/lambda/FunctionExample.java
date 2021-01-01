package com.company.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {

    public static void run() {
        List<String> listExample = new ArrayList();
        listExample.add("q");
        listExample.add("w");
        listExample.add("");
        listExample.add("r");

        map(listExample, (str) -> str.length()).stream().forEach((el) -> System.out.println(el));
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T item : list) {
            result.add(function.apply(item));
        }
        return result;
    }
}
