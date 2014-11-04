package com.erikpartridge.models;

/**
 * Created by Erik in 11, 2014.
 */
public class SimpleRunway {

    private String id;

    private double latitude;

    private double longitude;

    public SimpleRunway(String id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
