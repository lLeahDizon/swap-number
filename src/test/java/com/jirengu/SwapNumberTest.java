package com.jirengu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapNumberTest {
    PrintStream originalOut;
    ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testSwap() {
        // Act
        SwapNumber.main(null);

        // Assert
        String output = outputStream.toString();
        String expectedOutput =
            String.format("num 1 after swapping: %d\n"
                + "num 2 after swapping: %d\n",
                SwapNumber.number2, SwapNumber.number1);
        assertEquals(expectedOutput, output);
        // assertEquals(nu)
    }

}
