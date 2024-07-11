package com.coherentsolutions.java.webauto.section10;

import java.time.LocalDate;

/**
 * Movie class extends Disk to represent a movie disk.
 */
public class Movie extends Disk {
    public Movie(String name, LocalDate inventoryDate, int rating) {
        super(name, inventoryDate, rating, "Movie");
    }
}