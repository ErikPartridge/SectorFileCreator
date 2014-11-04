package com.erikpartridge.parser;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Erik in 11, 2014.
 */
public class Downloader {

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

}
