package dev.lukmann.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
//        Try with resource yang mewariskan class AutoClosable

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md")))
        {
            while (true) {
                String line = reader.readLine();
                if (line == null)
                    break;

                System.out.println(line);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
