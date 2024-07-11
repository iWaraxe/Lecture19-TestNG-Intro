package com.coherentsolutions.java.webauto.section10;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Disk class represents a generic disk with a name, inventory date, rating, and type.
 */
public abstract class Disk {
    protected String name;
    protected LocalDate inventoryDate;
    protected int rating;
    protected String type;

    public Disk(String name, LocalDate inventoryDate, int rating, String type) {
        this.name = name;
        this.inventoryDate = inventoryDate;
        this.rating = rating;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disk disk = (Disk) o;
        return rating == disk.rating &&
                Objects.equals(name, disk.name) &&
                Objects.equals(inventoryDate, disk.inventoryDate) &&
                Objects.equals(type, disk.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inventoryDate, rating, type);
    }
}







