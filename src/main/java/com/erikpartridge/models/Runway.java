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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Runway)) return false;

        Runway runway = (Runway) o;

        if (Double.compare(runway.width, width) != 0) return false;
        if (id != null ? !id.equals(runway.id) : runway.id != null) return false;
        if (nodes != null ? !nodes.equals(runway.nodes) : runway.nodes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (nodes != null ? nodes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Runway{" +
                "id='" + id + '\'' +
                ", width=" + width +
                ", nodes=" + nodes +
                '}';
    }
}
