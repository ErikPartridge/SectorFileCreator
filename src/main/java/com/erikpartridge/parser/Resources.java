package com.erikpartridge.parser;

import com.erikpartridge.models.Airport;
import com.erikpartridge.models.Node;
import com.erikpartridge.models.Waypoint;

import java.util.HashMap;

/**
 * Created by Erik in November, 2014.
 */
public class Resources {

    /**
     * List of all OSM Nodes, placed by string to avoid boxing issues
     */
    public static HashMap<String, Node> nodes = new HashMap<>();

    /**
     * List of all Airports, loaded from myfsim.com
     */
    public static HashMap<String, Airport> airports = new HashMap<>();

    /**
     * List of all Waypoints, loaded from myfsim.com
     */
    public static HashMap<String, Waypoint> waypoints = new HashMap<>();


}
