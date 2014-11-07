package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */
public class Way {

    private ArrayList<Node> nodes;

    private ArrayList<Tag> tags;

    public Way(ArrayList<Node> nodes, ArrayList<Tag> tags) {
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
}
