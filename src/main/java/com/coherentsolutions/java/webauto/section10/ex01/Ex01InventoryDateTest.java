package com.coherentsolutions.java.webauto.section10.ex01;

import com.coherentsolutions.java.webauto.section10.Storage;
import com.coherentsolutions.java.webauto.section10.WrongParameterException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * This class demonstrates a parameterized test in TestNG for checking
 * inventory dates which are expected to throw a WrongParameterException.
 */
public class Ex01InventoryDateTest {

    @Test(dataProvider = "inventoryDateDataProvider", expectedExceptions = WrongParameterException.class)
    public void testGetAllByYear(String year) throws WrongParameterException {
        Storage storage = new Storage();
        storage.getAllBy(year);
    }

    @DataProvider(name = "inventoryDateDataProvider")
    public static Object[][] getYearsData() {
        return new Object[][] {
                {"2030"},
                {"342389"},
                {"5684"},
                {"1999"}
        };
    }
}
