package com.erikpartridge.utils;

/**
 * Created by Erik in 11, 2014.
 */
public class DoubleUtils {


    protected static String latLonToString(boolean longitude, double input){
        int deg = (int)input; // truncate to get the degrees part
        double fraction = Math.abs(input - deg); //the decimal part 0 < x < 1
        int min = (int)(fraction * 60);
        double seconds = (fraction * 3600 - min * 60);
        String numerical = Math.abs(deg) + ". " + min + "." + seconds;
        //What are the first two characters?
        if(deg < 0){
            if(longitude){
                numerical = "W" + numerical;
                if(deg < 100){
                    numerical = numerical.substring(0,1) + "0" + numerical.substring(1);
                }
            }else{
                numerical = "S" + numerical;
            }
            if(deg < 100){
                numerical = numerical.substring(0,1) + "0" + numerical.substring(1);
            }
        }else{
            if(longitude){
                numerical = "E" + numerical;
                if(deg < 100){
                    numerical = numerical.substring(0,1) + "0" + numerical.substring(1);
                }
            }else{
                numerical = "N" + numerical;
                if(deg < 100){
                    numerical = numerical.substring(0,1) + "0" + numerical.substring(1);
                }
            }
        }

        return numerical;
    }

    public static String vrcString(double latitude, double longitude){
        return latLonToString(false, latitude) + " " + latLonToString(true, longitude);
    }


}
