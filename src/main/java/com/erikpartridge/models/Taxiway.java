package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */
public class Taxiway {

    private final String id;

    private final ArrayList<Node> nodes;

    private final double width;

    public Taxiway(String id, ArrayList<Node> nodes, double width) {
        this.id = id;
        this.nodes = nodes;
        this.width = width;
    }

    public Taxiway(String id, ArrayList<Node> nodes) {
        this.id = id;
        this.nodes = nodes;
        this.width = 50.0d;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public double getWidth() {
        return width;
    }
}
