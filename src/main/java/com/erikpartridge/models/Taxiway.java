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

    /**
     *
     * @return the identifier that will be used in static text
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return the nodes that are the middle of the taxiway. Static text will be posted at every other node.
     */
    public ArrayList<Node> getNodes() {
        return nodes;
    }

    /**
     *
     * @return the width of the taxiway
     */
    public double getWidth() {
        return width;
    }
}
