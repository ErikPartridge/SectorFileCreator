package com.erikpartridge.parser;

import com.erikpartridge.models.Airport;
import com.erikpartridge.models.Building;
import com.erikpartridge.models.Node;
import com.erikpartridge.models.Way;

import java.util.HashMap;

/**
 * Created by Erik in November, 2014.
 */
public final class Resources {

    /**
     * List of all OSM Nodes, placed by string to avoid boxing issues
     */
    public static HashMap<String, Node> nodes = new HashMap<>();

    /**
     * List of all OSM Ways, also placed by string for same reason
     */
    public static HashMap<String, Way> ways = new HashMap<>();

    public static HashMap<String, Building> buildings = new HashMap<>();

    /**
     * List of all Airports loaded from OSM
     */
    public static HashMap<String, Airport> airports = new HashMap<>();

    private Resources(){
    }

}
