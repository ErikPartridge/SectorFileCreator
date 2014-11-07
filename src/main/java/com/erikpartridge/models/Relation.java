package com.erikpartridge.models;

import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */
public class Relation {

    private ArrayList<Way> members;

    private ArrayList<Tag> tags;

    public Relation(ArrayList<Way> members, ArrayList<Tag> tags) {
        this.setMembers(members);
        this.setTags(tags);
    }


    public ArrayList<Way> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Way> members) {
        this.members = members;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }
}
