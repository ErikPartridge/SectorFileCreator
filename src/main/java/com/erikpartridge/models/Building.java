package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */

/**
 * A class to distinguish buildings from ways
 */
public class Building extends Way{

    public Building(){
        super();
    }

    /**
     *
     * @param id see Way
     * @param nodes see Way
     * @param tags see Way
     */
    public Building(String id, ArrayList<Node> nodes, ArrayList<Tag> tags){
        super(id, nodes,tags);
    }

    /**
     *
     * @param w the way to make a building from
     * @return a building with same values as w
     */
    public static Building fromWay(Way w){
        return new Building(w.getId(), w.getNodes(), w.getTags());
    }

    
    @Override
    public String toString(){
        //TODO
        return "";
    }
    

}
