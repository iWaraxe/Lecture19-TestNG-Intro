package com.coherentsolutions.java.webauto.section03.advanced;

import org.testng.annotations.Test;

/**
 * This class demonstrates advanced test method dependencies in TestNG.
 */
public class Ex02AdvancedDependencies {

    @Test
    public void baseMethod() {
        System.out.println("Base Method");
    }

    @Test(dependsOnMethods = {"baseMethod"})
    public void intermediateMethod() {
        System.out.println("Intermediate Method (Depends on Base Method)");
    }

    @Test(dependsOnMethods = {"intermediateMethod"})
    public void finalMethod() {
        System.out.println("Final Method (Depends on Intermediate Method)");
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[]{Ex02AdvancedDependencies.class});
        testng.run();
    }
}
