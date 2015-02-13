package com.erikpartridge.io;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public final class Writer {
    
    private FileWriter writer; 
    
    
    public Writer(String path){
        try {
            writer = new FileWriter(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void header(){
        try {
            writer.write(";This file was created in the .sct2 file format by Erik Partridge's sector file creator, and the contents are hereby released under the GPL v2.0 for your usage. It is recommended that one modify this file only by hand or in pieces to preserve carefully made formatting. This file is valid as of " + Calendar.getInstance().getTime().toString() +"");
            writer.write(";------------------------");
            writer.write("[INFO]");
            writer.write("NAME VERSION 1.0");
            writer.write("BOS_CTR");
            writer.write("CON");
            writer.write("N041.39.44.600\n" +
                    "W070.31.20.599\n" +
                    "240.000\n" +
                    "178.000\n" +
                    "16.000\n" +
                    "1.000");
            writer.write(";-------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void navaids(){

        try {
            writer.write("[VORS]");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
