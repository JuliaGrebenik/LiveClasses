package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String read (String path, String key) throws IOException {

        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties(); //special class
        properties.load(fis);
        return properties.getProperty(key);

    }
}
