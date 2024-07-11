package com.coherentsolutions.java.webauto.section05;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * This class demonstrates parameterized testing using TestNG and Maven.
 */
public class Ex02ParameterizedTest {

    @Test
    @Parameters({"param1", "param2"})
    public void parameterizedTest(String param1, int param2) {
        System.out.println("Param1: " + param1 + ", Param2: " + param2);
    }
}
