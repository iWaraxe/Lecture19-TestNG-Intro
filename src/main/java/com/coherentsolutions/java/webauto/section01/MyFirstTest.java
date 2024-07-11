package com.coherentsolutions.java.webauto.section01;

import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void simpleTest() {
        System.out.println("This is a simple TestNG test");
    }

    public static void main(String[] args) {
        org.testng.TestNG.main(new String[]{MyFirstTest.class.getName()});
    }
}
