package com.coherentsolutions.java.webauto.section10.advanced;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Demonstrates the use of complex data structures in parameterized tests.
 */
public class Ex04ComplexDataProviderTest {

    @Test(dataProvider = "complexDataProvider")
    public void testComplexData(Disk disk, String expectedType) {
        System.out.println("Testing disk: " + disk);
        Assert.assertEquals(disk.getType(), expectedType);
    }

    @DataProvider(name = "complexDataProvider")
    public static Object[][] getComplexData() {
        return new Object[][] {
                {new Disk("Game", 5, "Game"), "Game"},
                {new Disk("Movie", 3, "Movie"), "Movie"},
                {new Disk("Soft", 4, "Soft"), "Soft"},
                {new Disk("Music", 5, "Music"), "Music"}
        };
    }

    /**
     * Inner class representing a more detailed Disk.
     */
    static class Disk {
        private String name;
        private int rating;
        private String type;

        public Disk(String name, int rating, String type) {
            this.name = name;
            this.rating = rating;
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Disk{" +
                    "name='" + name + '\'' +
                    ", rating=" + rating +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
