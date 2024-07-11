package com.coherentsolutions.java.webauto.section02;

import org.testng.annotations.Test;

/**
 * This class demonstrates a simple TestNG test case.
 */
public class Ex02WritingYourFirstTestCase {

    /**
     * This is a simple test method that prints a message.
     */
    @Test
    public void simpleTest() {
        System.out.println("This is a simple TestNG test");
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[] { Ex02WritingYourFirstTestCase.class });
        testng.run();
    }
}
