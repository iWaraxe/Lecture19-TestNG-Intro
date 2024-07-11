package com.coherentsolutions.java.webauto.section10.ex02;

import com.coherentsolutions.java.webauto.section10.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDate;

/**
 * This class demonstrates parameterized tests in TestNG for different types of disks.
 */
public class Ex02DiskNameTest {

    private Storage storage = new Storage();

    @Test(dataProvider = "diskNameDataProvider")
    public void testGetByNameWithParameters(String name, Disk expectedDisk) {
        Main.fillStorage(storage);
        Disk actualDisk = storage.getBy(name);
        Assert.assertEquals(actualDisk, expectedDisk);
    }

    @DataProvider(name = "diskNameDataProvider")
    public static Object[][] getDiskNamesData() {
        return new Object[][] {
                {"Game", new Game("Game", LocalDate.of(2020, 10, 10), 3)},
                {"Movie", new Movie("Movie", LocalDate.of(2020, 8, 10), 3)},
                {"Soft", new Soft("Soft", LocalDate.of(2021, 3, 12), 5)},
                {"Music", new Music("Music", LocalDate.of(2019, 3, 1), 5)}
        };
    }
}

/**
 * Main class to populate storage for testing purposes.
 */
class Main {
    public static void fillStorage(Storage storage) {
        storage.add(new Game("Game", LocalDate.of(2020, 10, 10), 5));
        storage.add(new Movie("Movie", LocalDate.of(2020, 8, 10), 3));
        storage.add(new Soft("Soft", LocalDate.of(2021, 3, 12), 5));
        storage.add(new Music("Music", LocalDate.of(2019, 3, 1), 5));
    }
}

