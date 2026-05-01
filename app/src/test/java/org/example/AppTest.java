package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testBasicCalculation() {

        double result = App.calculate(
                new double[]{100, 50},
                new int[]{1, 2},
                "REGULAR",
                "NONE"
        );

        // 100 + 100 = 200
        // tax 15% = 230
        assertEquals(230, result);
    }
}