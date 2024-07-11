package com.coherentsolutions.java.webauto.section03;

import org.testng.annotations.Test;

/**
 * This class demonstrates grouping of test methods in TestNG.
 */
public class Ex02GroupingTests {

    @Test(groups = {"group1"})
    public void testMethod1() {
        System.out.println("Test Method 1 - Group 1");
    }

    @Test(groups = {"group2"})
    public void testMethod2() {
        System.out.println("Test Method 2 - Group 2");
    }

    @Test(groups = {"group1", "group2"})
    public void testMethod3() {
        System.out.println("Test Method 3 - Group 1 and 2");
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[]{Ex02GroupingTests.class});
        testng.run();
    }
}
