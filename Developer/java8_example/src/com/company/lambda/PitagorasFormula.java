package com.company.lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PitagorasFormula {

    public static void run() {
        Stream<int[]> pita = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .mapToObj(b -> new int[] {a, b, (int) Math.sqrt(a*a + b*b)})
                                .filter(t -> Math.sqrt(t[2]) % 1 == 0)

                );

        pita.limit(5)
                .forEach(t ->
                        System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

    }
}
