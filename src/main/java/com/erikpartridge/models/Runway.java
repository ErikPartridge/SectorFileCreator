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

    public String getId() {
        return id;
    }

    public double getWidth() {
        return width;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }
}
