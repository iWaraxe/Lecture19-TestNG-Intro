package com.coherentsolutions.java.webauto.section02;

import org.testng.annotations.Test;

/**
 * This class demonstrates test method dependencies in TestNG.
 */
public class Ex04TestDependencies {

    /**
     * Test method A which doesn't depend on any method.
     */
    @Test
    public void testMethodA() {
        System.out.println("Test Method A");
    }

    /**
     * Test method B which depends on testMethodA.
     */
    @Test(dependsOnMethods = { "testMethodA" })
    public void testMethodB() {
        System.out.println("Test Method B");
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[] { Ex04TestDependencies.class });
        testng.run();
    }
}
