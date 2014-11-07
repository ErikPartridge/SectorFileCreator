package com.erikpartridge.models;

/**
 * Created by Erik in November, 2014.
 */
public final class Waypoint {

    private final String id;

    private final double latitude;

    private final double longitude;

    public Waypoint(String id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     *
     * @return the five character identifier- eg. KRANN
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return the latitude of the waypoint
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     *
     * @return the longitude of the waypoint
     */
    public double getLongitude() {
        return longitude;
    }

}
