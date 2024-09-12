package org.example.class13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E10ConfigReader {
    public static void main(String[] args) throws IOException {
        String path="Files/Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties(); //special class
        prop.load(fis);
        System.out.println(prop.getProperty("userName"));

    }
}
