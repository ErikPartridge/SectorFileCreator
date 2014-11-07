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

    /**
     *
     * @return the nodes in the way
     */
    public ArrayList<Node> getNodes() {
        return nodes;
    }

    /**
     *
     * @param nodes the nodes in the way
     */
    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    /**
     *
     * @return the tags attached to this way
     */
    public ArrayList<Tag> getTags() {
        return tags;
    }

    /**
     *
     * @param tags the tags to assign to this way
     */
    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }


    /**
     *
     * @return the numeric string id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id the String to set the id to.
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Way)) return false;

        Way way = (Way) o;

        if (!id.equals(way.id)) return false;
        if (!nodes.equals(way.nodes)) return false;
        if (!tags.equals(way.tags)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nodes.hashCode();
        result = 31 * result + tags.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Way{" +
                "nodes=" + nodes +
                ", tags=" + tags +
                ", id='" + id + '\'' +
                '}';
    }
}
