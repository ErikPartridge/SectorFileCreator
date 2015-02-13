package com.erikpartridge.parser;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by Erik Partridge in November, 2014.
 */
public class Downloader {


    /**
     * @param states the list of state names, all lowercase, full name, with spaces replaced by dashes
     * @return an OSM file for each state
     */
    public static ArrayList<File> getOSM(ArrayList<String> states) {
        ArrayList<File> results = new ArrayList<>();
        states.parallelStream().forEach(state -> results.add(getOSM(state)));
        return results;
    }

    /**
     * @param state all lowercase name, full state name, spaces replaced by dashes
     * @return a temporary file containing unzipped osm data
     */
    public static File getOSM(String state) {
        File temp = null;
        //Copy the file, we've seen this before
        try {
            System.out.println("Downloading the zip for " + state);
            temp = File.createTempFile(state, ".bz2");
            FileUtils.copyURLToFile(new URL("http://download.geofabrik.de/north-america/us/" + state + "-latest.osm.bz2"), temp);
            System.out.println("Finished downloading the zip for " + state);
        } catch (IOException e) {
            System.err.println("Failed to download OSM for state " + state + ".");
            System.exit(24);
        }

        //Unzip the file, copy it to a new one, delete the old one
        File file = null;
        try {
            file = File.createTempFile(state, ".osm");
            FileOutputStream out = new FileOutputStream(file);
            BZip2CompressorInputStream zipstream = new BZip2CompressorInputStream(new FileInputStream(temp), true);
            IOUtils.copy(zipstream, out);
            temp.deleteOnExit();
            out.close();
            zipstream.close();
        } catch (IOException e) {
            System.err.println("Error in expanding state " + state + ".");
            System.exit(26);
        }
        return file;
    }

}
