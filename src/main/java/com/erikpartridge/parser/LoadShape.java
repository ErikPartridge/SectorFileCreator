package com.erikpartridge.parser;

import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.OperatorImportFromESRIShape;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Erik in 11, 2014.
 */
public class LoadShape {

    public static Geometry getGeometry(String state) throws IOException{
        File file = File.createTempFile(state, ".shp");
        FileUtils.copyURLToFile(new URL("http://download.geofabrik.de/north-america/us/"+state+"-latest.shp.zip"), file);

    }
}
