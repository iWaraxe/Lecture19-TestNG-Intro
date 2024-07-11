package com.coherentsolutions.java.webauto.section10;

import java.time.LocalDate;

/**
 * Soft class extends Disk to represent a software disk.
 */
public class Soft extends Disk {
    public Soft(String name, LocalDate inventoryDate, int rating) {
        super(name, inventoryDate, rating, "Soft");
    }
}