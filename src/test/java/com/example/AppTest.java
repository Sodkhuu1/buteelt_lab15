package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    void testAppConstructor() {
        new App(); // Just call constructor to ensure coverage
    }

    @Test
    void testMainOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        System.setOut(originalOut);

        assertEquals("Hellaaooo World!" + System.lineSeparator(), out.toString());
    }
}
