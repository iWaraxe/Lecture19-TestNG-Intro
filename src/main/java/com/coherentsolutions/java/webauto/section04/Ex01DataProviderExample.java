package com.coherentsolutions.java.webauto.section04;

import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Collections;

public class Ex01DataProviderExample {

    /**
     * DataProvider method providing test data.
     * @return Object array with test data.
     */
    @DataProvider(name = "testData")
    public Object[][] createData() {
        return new Object[][] {
                {"data1", 1},
                {"data2", 2}
        };
    }

    /**
     * Test method using the data from DataProvider.
     * @param data String data
     * @param number Integer data
     */
    @Test(dataProvider = "testData")
    public void testMethod(String data, int number) {
        System.out.println("Data: " + data + ", Number: " + number);
    }

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("src/test/resources/section04/testng-dataprovider.xml"));
        testng.run();
    }
}
