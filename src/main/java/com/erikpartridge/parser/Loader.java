package com.erikpartridge.parser;

import com.erikpartridge.models.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Erik in 11, 2014.
 */
public class Loader {


    public static void loadAll(ArrayList<File> files){
        for(File f : files){
            loadNodes(f);
            ArrayList<Way> ways = loadWays(f);
            loadBuildings(ways);
            loadCoastline(ways);
            for(Way way: filterAeroways(ways)){
                Resources.ways.put(way.getId(), way);
            }
        }
    }

    /**
     * @param file the file from which to derive the nodes
     */
    public static void loadNodes(File file){
        Document doc = null;

        try {
            doc = new SAXBuilder().build(file);
        } catch (JDOMException e) {
            System.err.println("Got a JDOMException trying to load nodes, exiting...");
            System.exit(42);
        } catch (IOException e) {
            System.err.println("IOException trying to load nodes, exiting...");
            System.exit(44);
        }

        Element root = doc.getRootElement();
        List<Element> nodeElements = root.getChildren("node");
        //TODO thread this
        for(Element e : nodeElements){
            loadPutNode(e);
        }
    }

    /**
     * @param element from a node element create a node and put it in the Resources.node map
     */
    protected static void loadPutNode(Element element){
        String id = element.getAttributeValue("id");
        double latitude = Double.parseDouble(element.getAttributeValue("lat"));
        double longitude = Double.parseDouble(element.getAttributeValue("lon"));
        Node node = new Node(id, latitude, longitude);
        Resources.nodes.put(id,node);
    }

    /**
     * @param file from a given file, get all the ways
     */
    public static ArrayList<Way> loadWays(File file){
        Document doc = null;

        try {
            doc = new SAXBuilder().build(file);
        } catch (JDOMException e) {
            System.err.println("Got a JDOMException trying to load ways, exiting...");
            System.exit(46);
        } catch (IOException e) {
            System.err.println("IOException trying to load ways, exiting...");
            System.exit(48);
        }
        ArrayList<Way> results = new ArrayList<>();
        Element root = doc.getRootElement();
        List<Element> wayElements = root.getChildren("way");
        //TODO thread this
        for(Element e : wayElements){
            List<Element> refs = e.getChildren("nd");
            ArrayList<Node> nodes = new ArrayList<>();
            //Get the node refs
            nodes.addAll(refs.stream().map(element -> Resources.nodes.get(element.getAttributeValue("ref"))).collect(Collectors.toList()));
            List<Element> tagRefs = e.getChildren("tag");
            ArrayList<Tag> tags = new ArrayList<>();
            // Get the tags
            tags.addAll(tagRefs.stream().map(element -> new Tag(element.getAttributeValue("k"), element.getAttributeValue("v"))).collect(Collectors.toList()));
            Way way = new Way(e.getAttributeValue("id"), nodes, tags);
            results.add(way);
        }
        return results;
    }

    /**
     * Load buildings
     * @param list the list to load buildings from
     */
    public static void loadBuildings(ArrayList<Way> list){
        List<Way> buildings = filterBuildings(filterAeroways(list));
        for(Way way: buildings){
            Resources.buildings.put(way.getId(), Building.fromWay(way));
        }
        //TOdo
    }

    /**
     *
     * @param list the list of ways to filter
     * @return a list containing only those tagged Aeroways
     */
    private static List<Way> filterAeroways(List<Way> list){
        return list.stream().filter(w -> containsAerowayTag(w.getTags())).collect(Collectors.toList());
    }

    /**
     *
     * @param tags a list of tags belonging to a node
     * @return if any of the tags' K value is aeroway
     */
    private static boolean containsAerowayTag(List<Tag> tags){
        for(Tag tag: tags){
            if(tag.getK().equals("aeroway")){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param tags a list of tags belonging to a node
     * @return if any of the tags' K value is building
     */
    private static boolean isBuilding(List<Tag> tags){
        for(Tag tag: tags){
            if(tag.getK().equals("building")){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param list the list of ways to filter
     * @return a list of only ways tagged "building"
     */
    private static List<Way> filterBuildings(List<Way> list){
        List<Way> aeroways = filterAeroways(list);
        ArrayList<Way> results = new ArrayList<>();
        for(Way way: aeroways){
            if(isBuilding(way.getTags())){
                results.add(way);
            }
        }
        return results;
    }

    /**
     * Load the coastline, ways have to be pre-loaded
     */
    public static void loadCoastline(ArrayList<Way> coast){
        coast.stream().filter(way -> isCoast(way.getTags())).forEach(way -> Resources.coastline.put(way.getId(), Coastline.coastlineFromWay(way)));
    }

    /**
     *
     * @param tags a list of tags belonging to a node
     * @return if any of the tags' V value is coastline
     */
    private static boolean isCoast(List<Tag> tags){
        for(Tag tag: tags){
            if(tag.getV().equals("coastline")){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param list the list of ways to filter
     * @return a list of only ways tagged "coastline"
     */
    private static List<Way> filterCoastline(List<Way> list){
        ArrayList<Way> results = new ArrayList<>();
        for(Way way: list){
            if(isCoast(way.getTags())){
                results.add(way);
            }
        }
        return results;
    }


}
