package com.erikpartridge.models;

/**
 * Created by Erik in 11, 2014.
 */

import java.util.ArrayList;

/**
 * A class to distinguish coastlines from ways
 */
public class Coastline extends Way {

    public Coastline(String id, ArrayList<Node> nodes, ArrayList<Tag> tags){
        super(id, nodes, tags);
    }

    /**
     *
     * @param way the way to make coastline from
     * @return
     */
    public static Coastline coastlineFromWay(Way way){
        return new Coastline(way.getId(), way.getNodes(), way.getTags());
    }
}
