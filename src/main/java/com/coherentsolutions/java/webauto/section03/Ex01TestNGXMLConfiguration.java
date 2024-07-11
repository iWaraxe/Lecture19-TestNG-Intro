package com.coherentsolutions.java.webauto.section03;

import org.testng.annotations.Test;

/**
 * This class demonstrates basic test methods to be configured in testng.xml.
 */
public class Ex01TestNGXMLConfiguration {

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2");
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[]{Ex01TestNGXMLConfiguration.class});
        testng.run();
    }
}
