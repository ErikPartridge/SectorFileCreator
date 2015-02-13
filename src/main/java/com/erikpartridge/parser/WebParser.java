package com.erikpartridge.parser;

import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Created by Erik in 11, 2014.
 */
public class WebParser {

    private final String HIGH_AIRWAYS = "http://www.myfsim.com/sectorfilecreation/sfg/high_airways.txt";

    private final String LOW_AIRWAYS = "http://www.myfsim.com/sectorfilecreation/sfg/low_airways.txt";

    private final String FIXES = "http://www.myfsim.com/sectorfilecreation/sfg/fixs.txt";

    private final String VORS = "http://www.myfsim.com/sectorfilecreation/sfg/vors.txt";

    private final String NDBS = "http://www.myfsim.com/sectorfilecreation/sfg/vors.txt";

    public WebParser(String visCenter, int range){
        try{
            Jsoup.connect("http://www.myfsim.com/sectorfilecreation/sfg/update.php").execute();
        }catch (IOException e){
            System.out.println("Whoops, failed to update the FAA data from myfsim.com");
        }
        
        
    }



}
