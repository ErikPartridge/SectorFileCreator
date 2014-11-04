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


    public String getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
