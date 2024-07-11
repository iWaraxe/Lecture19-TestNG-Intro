package com.coherentsolutions.java.webauto.section04;

import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Collections;

@Listeners(Ex04CustomListener.class)
public class Ex05ListenerTest {

    @Test
    public void testMethod1() {
        System.out.println("Executing Test Method 1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing Test Method 2");
    }

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("src/test/resources/section04/testng-listener.xml"));
        testng.run();
    }
}
