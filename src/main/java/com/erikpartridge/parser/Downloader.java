package com.erikpartridge.parser;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Erik in 11, 2014.
 */
public class Downloader {

    /**
     * @return a temporary file containing information on all US airports, same file as found at http://www.myfsim.com/sectorfilecreation/Airports.xml
     */
    public static File getAirports(){
        File file = null;
        try{
            file = File.createTempFile("airports", ".xml");
            FileUtils.copyURLToFile(new URL("http://www.myfsim.com/sectorfilecreation/Airports.xml"), file);
        }catch(IOException e){
            System.err.println("Failed to download the required airports data, I'm quitting now.");
            System.exit(20);
        }
        return file;
    }

    /**
     * @return a temporary file containing information on all US waypoints, same file as found at http://www.myfsim.com/sectorfilecreation/Waypoints.xml
     */
    public static File getWaypoints(){
        File file = null;
        try{
            file = File.createTempFile("waypoints", ".xml");
            FileUtils.copyURLToFile(new URL("http://www.myfsim.com/sectorfilecreation/Waypoints.xml"), file);
        }catch(IOException e){
            System.err.println("Failed to download the required waypoints data, I'm quitting now.");
            System.exit(22);
        }
        return file;
    }

    public static ArrayList<File> getOSM(ArrayList<String> states) {
        ArrayList<File> results = new ArrayList<>();
        for (String state : states) {
            results.add(getOSM(state));
        }
        return results;
    }

    /**
     * @param state all lowercase name, full state name, spaces replaced by dashes
     * @return a temporary file containing unzipped osm data
     */
    public synchronized static File getOSM(String state) {
        File temp = null;
        try {
            temp = File.createTempFile(state, ".bz2");
            FileUtils.copyURLToFile(new URL("http://download.geofabrik.de/north-america/us/" + state + "-latest.osm.bz2"), temp);
        } catch (IOException e) {
            System.err.println("Failed to download OSM for state " + state + ".");
            System.exit(24);
        }

        File file = null;
        try {
            file = File.createTempFile(state, ".xml");
            FileOutputStream out = new FileOutputStream(file);
            BZip2CompressorInputStream zipstream = new BZip2CompressorInputStream(new FileInputStream(temp), true);
            final byte[] buffer = new byte[64];
            int n = 0;
            while (-1 != (n = zipstream.read(buffer))) {
                out.write(buffer, 0, n);
                n++;
            }
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
