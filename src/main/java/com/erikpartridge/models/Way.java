package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */
public class Way {

    private ArrayList<Node> nodes;

    private ArrayList<Tag> tags;

    private String id;

    public Way(String id, ArrayList<Node> nodes, ArrayList<Tag> tags) {
        this.setNodes(nodes);
        this.setTags(tags);
    }

    public Way(){
        this.nodes = new ArrayList<>();
        this.tags = new ArrayList<>();
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
