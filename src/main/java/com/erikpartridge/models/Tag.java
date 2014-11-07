package com.erikpartridge.models;

/**
 * Created by Erik in 11, 2014.
 */
public class Tag {

    private String k;

    private String v;

    public Tag(String k, String v) {
        this.k = k;
        this.v = v;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
