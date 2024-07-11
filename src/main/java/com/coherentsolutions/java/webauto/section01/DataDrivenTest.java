package com.coherentsolutions.java.webauto.section01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

    @DataProvider(name = "testData")
    public Object[][] createData() {
        return new Object[][] {
                { "data1", 1 },
                { "data2", 2 }
        };
    }

    @Test(dataProvider = "testData")
    public void testMethod(String data, int number) {
        System.out.println("Data: " + data + ", Number: " + number);
    }

    public static void main(String[] args) {
        org.testng.TestNG.main(new String[]{DataDrivenTest.class.getName()});
    }
}
