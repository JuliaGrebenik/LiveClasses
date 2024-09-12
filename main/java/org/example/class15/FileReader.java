package org.example.class15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {


    public void read(){

        try {
            FileInputStream fis=new FileInputStream("Files/Config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}




