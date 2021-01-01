package com.company.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOldExample {

    public static void run() {
        try {
            String result = processFile();
            System.out.println("Lambda Example FileOld Result: " + result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String processFile() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return bufferedReader.readLine();
        }
    }
}
