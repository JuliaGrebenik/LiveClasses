package org.example.class14;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E1ExcelReader {
    public E1ExcelReader() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {

        String path = "Files/data.xlsx"; //location
        FileInputStream fis = new FileInputStream(path); //creating an objiect
XSSFWorkbook excel=new XSSFWorkbook(fis);
Sheet sheet=excel.getSheet("Sheet1");
        Row row=sheet.getRow(3);
        Cell cell=row.getCell(2);
        System.out.println(cell.toString());

    }
}

