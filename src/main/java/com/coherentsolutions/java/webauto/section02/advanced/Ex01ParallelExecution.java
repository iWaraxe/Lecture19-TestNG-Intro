package com.coherentsolutions.java.webauto.section02.advanced;

import org.testng.annotations.Test;

/**
 * This class demonstrates parallel test execution in TestNG.
 */
public class Ex01ParallelExecution {

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1 - Thread ID: " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2 - Thread ID: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[] { Ex01ParallelExecution.class });
        testng.setParallel("methods");
        testng.setThreadCount(2);
        testng.run();
    }
}
