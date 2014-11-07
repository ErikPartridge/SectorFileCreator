package com.erikpartridge.models;

/**
 * Created by Erik in 11, 2014.
 */
public class Tag {

    private final String k;
    private final String v;

    /**
     *
     * @param k the k attribute
     * @param v the v attribute
     */
    public Tag(String k, String v) {
        this.k = k;
        this.v = v;
    }

    /**
     *
     * @return the k value
     */
    public String getK() {
        return k;
    }


    public String getV() {
        return v;
    }
}
