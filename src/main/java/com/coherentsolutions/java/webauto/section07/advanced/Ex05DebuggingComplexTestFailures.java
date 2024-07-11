package com.coherentsolutions.java.webauto.section07.advanced;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Advanced example demonstrating debugging complex test failures.
 */
public class Ex05DebuggingComplexTestFailures {

    @Test
    public void testComplexAddition() {
        int result = complexAdd(5, 10, 20);
        Assert.assertEquals(result, 35, "Complex addition result should be 35");
    }

    private int complexAdd(int a, int b, int c) {
        // Potentially complex logic with multiple steps
        return a + b + c;
    }
}
