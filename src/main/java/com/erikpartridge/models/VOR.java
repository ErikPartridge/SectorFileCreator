package com.erikpartridge.models;

import com.javadocmd.simplelatlng.LatLng;

import java.util.LinkedHashMap;

/**
 * Created by Erik in 11, 2014.
 */
public class VOR {

    public static LinkedHashMap<String, VOR> vors = new LinkedHashMap<>();

    private String name;

    private LatLng latlng;

    public VOR(String string, LatLng latLng){
        this.name = string;
        this.latlng = latLng;
    }

    public void addVOR(VOR vor){
        vors.put(vor.getName(), vor);
    }


    public String getName() {
        return name;
    }

    public void setString(String string) {
        this.name = string;
    }

    public LatLng getLatlng() {
        return latlng;
    }

    public void setLatlng(LatLng latlng) {
        this.latlng = latlng;
    }
}
