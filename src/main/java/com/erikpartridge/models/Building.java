package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */
public class Building extends Way{

    public Building(){
        super();
    }

    public Building(String id, ArrayList<Node> nodes, ArrayList<Tag> tags){
        super(id, nodes,tags);
    }

    public static Building fromWay(Way w){
        return new Building(w.getId(), w.getNodes(), w.getTags());
    }
}
