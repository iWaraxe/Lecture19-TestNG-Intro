package com.coherentsolutions.java.webauto.section10.advanced;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Demonstrates the use of Factory for creating tests with different parameters.
 */
public class Ex03AdvancedParameterizedTest {

    private String name;
    private int rating;

    @Factory(dataProvider = "diskFactoryDataProvider")
    public Ex03AdvancedParameterizedTest(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Test
    public void testDiskCreation() {
        Disk disk = new Disk(name, rating);
        System.out.println("Testing disk: " + disk);
        // Add assertions or other test logic here
    }

    @DataProvider(name = "diskFactoryDataProvider")
    public static Object[][] getData() {
        return new Object[][] {
                {"Game", 5},
                {"Movie", 3},
                {"Soft", 4},
                {"Music", 5}
        };
    }

    /**
     * Inner class representing a simple Disk.
     */
    static class Disk {
        private String name;
        private int rating;

        public Disk(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "Disk{" +
                    "name='" + name + '\'' +
                    ", rating=" + rating +
                    '}';
        }
    }
}
