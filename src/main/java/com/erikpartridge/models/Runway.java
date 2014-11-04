package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */
public class Runway {

    private final String id;

    private final double width;

    private final ArrayList<Node> nodes;

    public Runway(String identifier, double width, ArrayList<Node> nodes) {
        this.id = identifier;
        this.width = width;
        this.nodes = nodes;
    }

    /**
     *
     * @return the identifier- eg. 04L/22R could also be 4L/22R
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return the width of the taxiway
     */
    public double getWidth() {
        return width;
    }

    /**
     *
     * @return the nodes -- the points that run down the center of the runway
     */
    public ArrayList<Node> getNodes() {
        return nodes;
    }
}
