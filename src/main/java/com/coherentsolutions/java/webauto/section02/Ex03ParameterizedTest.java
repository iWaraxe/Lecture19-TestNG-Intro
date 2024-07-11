package com.coherentsolutions.java.webauto.section02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * This class demonstrates a parameterized test in TestNG.
 */
public class Ex03ParameterizedTest {

    /**
     * DataProvider method that provides test data.
     */
    @DataProvider(name = "testData")
    public Object[][] createData() {
        return new Object[][] {
                { "data1", 1 },
                { "data2", 2 }
        };
    }

    /**
     * Test method that uses the provided data.
     * @param data String data
     * @param number Integer data
     */
    @Test(dataProvider = "testData")
    public void testMethod(String data, int number) {
        System.out.println("Data: " + data + ", Number: " + number);
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[] { Ex03ParameterizedTest.class });
        testng.run();
    }
}
