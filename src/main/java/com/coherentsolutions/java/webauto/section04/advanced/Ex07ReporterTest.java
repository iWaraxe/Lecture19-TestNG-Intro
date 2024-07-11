package com.coherentsolutions.java.webauto.section04.advanced;

import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.Collections;

public class Ex07ReporterTest {

    @Test
    public void testMethod1() {
        System.out.println("Executing Test Method 1 for Reporter");
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing Test Method 2 for Reporter");
    }

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("src/test/resources/section04/testng-reporter.xml"));
        testng.run();
    }
}
