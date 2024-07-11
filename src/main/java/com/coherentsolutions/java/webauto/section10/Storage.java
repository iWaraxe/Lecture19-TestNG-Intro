package com.coherentsolutions.java.webauto.section10;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a storage system that throws an exception
 * for certain parameters.
 */
public class Storage {
    private List<Disk> disks = new ArrayList<>();

    public void add(Disk disk) {
        disks.add(disk);
    }

    public Disk getBy(String name) {
        for (Disk disk : disks) {
            if (disk.name.equals(name)) {
                return disk;
            }
        }
        return null;
    }

    public void getAllBy(String year) throws WrongParameterException {
        // Simulate logic that throws an exception for certain years
        if (!year.matches("\\d{4}")) {
            throw new WrongParameterException("Invalid year: " + year);
        }
        // Assume some storage logic here
    }
}
