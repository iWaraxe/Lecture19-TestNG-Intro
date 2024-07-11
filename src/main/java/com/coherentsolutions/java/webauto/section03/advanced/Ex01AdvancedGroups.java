package com.coherentsolutions.java.webauto.section03.advanced;

import org.testng.annotations.Test;

/**
 * This class demonstrates advanced grouping of test methods in TestNG.
 */
public class Ex01AdvancedGroups {

    @Test(groups = {"init"})
    public void initMethod() {
        System.out.println("Initialization Method - Group init");
    }

    @Test(groups = {"init"})
    public void anotherInitMethod() {
        System.out.println("Another Initialization Method - Group init");
    }

    @Test(groups = {"process"}, dependsOnGroups = {"init"})
    public void processMethod() {
        System.out.println("Processing Method - Group process");
    }

    @Test(groups = {"cleanup"}, dependsOnGroups = {"process"})
    public void cleanupMethod() {
        System.out.println("Cleanup Method - Group cleanup");
    }

    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[]{Ex01AdvancedGroups.class});
        testng.run();
    }
}
