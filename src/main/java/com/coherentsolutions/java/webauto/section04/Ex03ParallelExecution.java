package com.coherentsolutions.java.webauto.section04;

import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.Collections;

public class Ex03ParallelExecution {

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1 - Thread: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2 - Thread: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod3() {
        System.out.println("Test Method 3 - Thread: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("src/test/resources/section04/testng-parallel.xml"));
        testng.run();
    }
}
