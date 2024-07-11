package com.coherentsolutions.java.webauto.section10;

import java.time.LocalDate;

/**
 * Game class extends Disk to represent a game disk.
 */
public class Game extends Disk {
    public Game(String name, LocalDate inventoryDate, int rating) {
        super(name, inventoryDate, rating, "Game");
    }
}