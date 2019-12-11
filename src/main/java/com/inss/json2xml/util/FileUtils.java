package com.inss.json2xml.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class FileUtils {
    public InputStream fetchFile(String filePath)  {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inputStream;
    }
}
