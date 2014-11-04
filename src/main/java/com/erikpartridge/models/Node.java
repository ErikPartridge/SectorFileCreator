package com.erikpartridge.models;

/**
 * Created by Erik in November, 2014.
 */
public class Node {

    private final String id;

    private final double latitude;

    private final double longitude;

    public Node(String id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     *
     * @return the identifier of form \d*
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return the latitude of the node
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     *
     * @return the longitude of the node
     */
    public double getLongitude() {
        return longitude;
    }
}
