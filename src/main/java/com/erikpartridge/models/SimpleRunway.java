package com.erikpartridge.models;

/**
 * Created by Erik in 11, 2014.
 */
public class SimpleRunway {

    private final String id;

    private final double startLatitude;

    private final double startLongitude;

    private final double endLatitude;

    private final double endLongitude;


    public String getId() {
        return id;
    }

    public double getStartLatitude() {
        return startLatitude;
    }

    public double getStartLongitude() {
        return startLongitude;
    }

    public double getEndLatitude() {
        return endLatitude;
    }

    public double getEndLongitude() {
        return endLongitude;
    }

    public SimpleRunway(String id, double startLatitude, double startLongitude, double endLatitude, double endLongitude) {
        this.id = id;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
    }
}
