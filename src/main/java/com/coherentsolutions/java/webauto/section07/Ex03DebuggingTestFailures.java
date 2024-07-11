package com.coherentsolutions.java.webauto.section07;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Example class demonstrating common pitfalls and debugging test failures.
 */
public class Ex03DebuggingTestFailures {

    @Test
    public void testAddition() {
        int result = add(2, 3);
        Assert.assertEquals(result, 5, "Addition result should be 5");
    }

    @Test
    public void testSubtraction() {
        int result = subtract(5, 3);
        Assert.assertEquals(result, 2, "Subtraction result should be 2");
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }
}
