package org.example.class15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class E4Exception {
    public static void main(String[] args)  {


        try {
            FileInputStream fis = new FileInputStream("Files/Config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties properties = new Properties();


        }
    }
