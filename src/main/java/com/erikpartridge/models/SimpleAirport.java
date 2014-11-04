package com.erikpartridge.models;

/**
 * Created by Erik in 11, 2014.
 * This should only be used for airports loaded from myfsim.com
 */
public class SimpleAirport {

    private final String id;

    private final double latitude;

    private final double longitude;

    public SimpleAirport(String id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     *
     * @return the identifier suchas MA09
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return the latitude of the airport
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     *
     * @return the longitude of the airport
     */
    public double getLongitude() {
        return longitude;
    }
}
