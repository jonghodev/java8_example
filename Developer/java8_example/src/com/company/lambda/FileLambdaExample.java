package com.company.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLambdaExample {

    public static void run() {
        try {
            String result = processFile((BufferedReader bufferedReader) -> bufferedReader.readLine() + "\n" + bufferedReader.readLine());
            System.out.println("Lambda Example FileLambda Result: " + result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return bufferedReaderProcessor.process(bufferedReader);
        }
    }
}
