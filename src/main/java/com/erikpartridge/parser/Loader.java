package com.erikpartridge.parser;

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

    /**
     * Load each airport into Resources.airports
     */
    public static void loadSimpleAirports(){
        File file = Downloader.getAirports();
        //Instantiate a Document object
        Document doc = null;
        try {
            doc = new SAXBuilder().build(file);
        } catch (JDOMException e) {
            System.err.println("Got a JDOMException trying to load airports, exiting...");
            System.exit(30);
        } catch (IOException e) {
            System.err.println("IOException trying to load airports, exiting...");
            System.exit(32);
        }
        //Get the root so we can process
        Element root = doc.getRootElement();

        System.out.println("I'm using AIRAC version " + root.getChild("AIRAC").getContent() + " for the airports");

        List<Element> airports = root.getChildren("Airport");
    }


}
