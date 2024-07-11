package com.coherentsolutions.java.webauto.section10;

import java.time.LocalDate;

/**
 * Music class extends Disk to represent a music disk.
 */
public class Music extends Disk {
    public Music(String name, LocalDate inventoryDate, int rating) {
        super(name, inventoryDate, rating, "Music");
    }
}
