package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in November, 2014.
 */
public class Airport {

    private final ArrayList<Runway> runways;

    private final ArrayList<Taxiway> taxiways;

    private final ArrayList<Building> buildings;

    private final ArrayList<Node> boundaries;

    public Airport(ArrayList<Runway> runways, ArrayList<Taxiway> taxiways, ArrayList<Building> buildings, ArrayList<Node> boundaries) {
        this.runways = runways;
        this.taxiways = taxiways;
        this.buildings = buildings;
        this.boundaries = boundaries;
    }

    /**
     *
     * @return the list of the runways in the airport
     */
    public ArrayList<Runway> getRunways() {
        return runways;
    }

    /**
     *
     * @return the list of the taxiways the airport holds
     */
    public ArrayList<Taxiway> getTaxiways() {
        return taxiways;
    }

    /**
     *
     * @return the list of buildings the airport holds
     */
    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    /**
     *
     * @return the list of nodes that are the boundaries of the airport
     */
    public ArrayList<Node> getBoundaries() {
        return boundaries;
    }
}
