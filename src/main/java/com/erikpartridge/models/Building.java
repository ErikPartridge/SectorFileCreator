package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */
public class Building {

    private final ArrayList<Node> boundaries;

    public Building(ArrayList<Node> boundaries) {
        this.boundaries = boundaries;
    }


    /**
     *
     * @return the boundaries of the building
     */
    public ArrayList<Node> getBoundaries() {
        return boundaries;
    }
}
