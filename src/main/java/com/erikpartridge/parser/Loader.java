package com.erikpartridge.parser;

import com.erikpartridge.models.Node;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Erik in 11, 2014.
 */
public class Loader {


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

    protected static void loadPutNode(Element element){
        String id = element.getAttributeValue("id");
        double latitude = Double.parseDouble(element.getAttributeValue("lat"));
        double longitude = Double.parseDouble(element.getAttributeValue("lon"));
        Node node = new Node(id, latitude, longitude);
        Resources.nodes.put(id,node);
    }

}
