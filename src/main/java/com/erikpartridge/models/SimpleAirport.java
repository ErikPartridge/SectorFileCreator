package com.erikpartridge.models;

/**
 * Created by Erik in 11, 2014.
 * This should only be used for airports loaded from myfsim.com
 */
public class SimpleAirport {

    private final String id;

    private final double latitude;

    private final double longitude;

    private final String frequency;

    public SimpleAirport(String id, double latitude, double longitude, String frequency) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.frequency = frequency;
    }



    /**
     *
     * @return the identifier such as MA09
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

    /**
     *
     * @return the frequency of the airport. Likely to be 0.0
     */
    public String getFrequency() {
        return frequency;
    }
}
