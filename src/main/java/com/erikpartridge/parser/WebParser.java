package com.erikpartridge.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Erik in 11, 2014.
 */
public class WebParser {

    private Document document = null;

    public WebParser(String visCenter, int range){
        try{
            document = Jsoup.connect("http://www.myfsim.com/sectorfilecreation/Result.php?BASE="+ visCenter + "&DIST=" + range + "&NOPTS=1").get();
        }catch (IOException e){
            System.err.println("Whoops! Failed to download data with parameters " + visCenter + "," + range);
        }
    }

    public String getVors(){
        Elements elements = document.getElementsByClass("textarea");
        Element vor = elements.get(0);
        return "[VOR]\n" + vor.text();
    }

    public String getNdbs(){
        Elements elements = document.getElementsByClass("textarea");
        Element ndb = elements.get(1);
        return "[NDB]\n" + ndb.text();
    }

    public String getFixes(){
        Elements elements = document.getElementsByClass("textarea");
        Element fixes = elements.get(2);
        return "[FIXES]\n" + fixes.text();
    }

    public String getAirports(){
        Elements elements = document.getElementsByClass("textarea");
        Element airports = elements.get(3);
        return "[AIRPORTS]\n" + airports.text();
    }

    public String getAirways(){
        Elements elements = document.getElementsByClass("textarea");
        String airways = elements.get(4).text() + elements.get(5).text();
        return airways;
    }


}
