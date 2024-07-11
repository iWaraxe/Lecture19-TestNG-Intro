package com.coherentsolutions.java.webauto.section04;

import org.testng.TestNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Collections;

public class Ex02ParameterizedTestUsingXML {

    @Test
    @Parameters({"param1", "param2"})
    public void parameterizedTest(String param1, int param2) {
        System.out.println("Param1: " + param1 + ", Param2: " + param2);
    }

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("src/test/resources/section04/testng-parameters.xml"));
        testng.run();
    }
}
