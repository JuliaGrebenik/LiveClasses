package org.example.class14;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E2ExcelReader {
    public E2ExcelReader() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {

        String path = "Files/data.xlsx"; //location
        FileInputStream fis = new FileInputStream(path); //creating an objiect
XSSFWorkbook excel=new XSSFWorkbook(fis);
Sheet sheet=excel.getSheet("Sheet1");
        Row row=sheet.getRow(2);

        for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
            Cell c=row.getCell(i);
            System.out.println(c.toString());

        }

    }
}

