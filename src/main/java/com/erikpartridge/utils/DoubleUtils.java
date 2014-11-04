package com.erikpartridge.utils;

/**
 * Created by Erik in 11, 2014.
 */
public class DoubleUtils {

    public static String latToString(double latitude){
        String result = "";
        if(latitude < 0.0){
            result =  "S" + Math.abs(latitude);
        }else{
            result = "N" + Math.abs(latitude);
        }
        if(!(latitude < -99.999999 || latitude > 99.99999)){
            result = result.substring(0,1) + 0 + result.substring(1);
        }
        return result;
    }

    public static String lonToString(double longitude){
        String result = "";
        if(longitude < 0.0){
            result =  "W" + Math.abs(longitude);
        }else{
            result = "E" + Math.abs(longitude);
        }
        if(!(longitude < -99.999999 || longitude > 99.99999)){
            result = result.substring(0,1) + 0 + result.substring(1);
        }
        return result;
    }

    
}
