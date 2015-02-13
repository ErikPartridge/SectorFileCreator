package com.erikpartridge.utils;

import java.text.NumberFormat;

/**
 * Created by Erik in 11, 2014.
 */
public class DoubleUtils {


    protected static String latLonToString(boolean longitude, double input){
        int deg = (int)input; // truncate to get the degrees part
        double fraction = Math.abs(input - deg); //the decimal part 0 < x < 1
        int min = (int)(fraction * 60);
        double seconds = (fraction * 3600 - min * 60);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);
        nf.setMinimumFractionDigits(4);
        String numerical = Math.abs(deg) + "." + min + "." + nf.format(seconds);
        //What are the first two characters?
        if(deg < 0){
            if(longitude){
                numerical = "W" + numerical;
                if(deg < 100){
                    numerical = numerical.substring(0,1) + numerical.substring(1);
                }
            }else{
                numerical = "S" + numerical;
            }
            if(deg < 100){
                numerical = numerical.substring(0,1) + numerical.substring(1);
            }
        }else{
            if(longitude){
                numerical = "E" + numerical;
                if(deg < 100){
                    numerical = numerical.substring(0,1) + numerical.substring(1);
                }
            }else{
                numerical = "N" + numerical;
                if(deg < 100){
                    numerical = numerical.substring(0,1) + numerical.substring(1);
                }
            }
        }

        return numerical;
    }

    public static String vrcString(double latitude, double longitude){
        return latLonToString(false, latitude) + " " + latLonToString(true, longitude);
    }


}
