package com.coherentsolutions.java.webauto.section03;

import org.testng.annotations.Test;

/**
 * This class demonstrates test method dependencies in TestNG.
 */
public class Ex03TestDependencies {

    @Test
    public void testMethodA() {
        System.out.println("Test Method A");
    }

    @Test(dependsOnMethods = {"testMethodA"})
    public void testMethodB() {
        System.out.println("Test Method B");
    }

    @Test(groups = {"group1"})
    public void testMethodC() {
        System.out.println("Test Method C - Group 1");
    }

    @Test(groups = {"group2"}, dependsOnGroups = {"group1"})
    public void testMethodD() {
        System.out.println("Test Method D - Group 2 (Depends on Group 1)");
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[]{Ex03TestDependencies.class});
        testng.run();
    }
}
