package com.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {

    public static void main(String[] args) throws IOException {
        try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("data.txt")) {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            int b;
            while (true) {
                b = in.read();
                if (b == -1) break;
                bo.write(b);
            }
            String message = bo.toString();
            System.out.println(message);
        }
    }

}