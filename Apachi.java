package com.company;


import com.sun.org.apache.xerces.internal.impl.xs.XSWildcardDecl;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;

public class Apachi {
    public static String[][]mass;
    int i=0;
    int j =0;
    int row = 0;//для выеяснения количества строк
    int cells=0;//для выяснения количества столбцов


    public Apachi(String s)throws Exception{

    try
    {
        File file = new File(s);
        FileInputStream inputFile = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputFile);
        XSSFSheet sheet = workbook.getSheetAt(0);


        for (Row row1 : sheet) {//выясняем количество ячеек
          row++;
          for (Cell cell:row1){
              cells++;
          }
        }
        cells = cells/row;
        mass = new String[row][cells];//задаём размеры масива

        for (int i=0;i<row;i++){
            for (int j=0;j<cells;j++){
               mass[i][j]=getTextCell(workbook.getSheetAt(0).getRow(i).getCell(j));
            }
        }
        inputFile.close();
        }
     catch(Exception e) {
         JOptionPane.showMessageDialog(null, "Ups");
     }

    }


    public static String getTextCell(Cell cell) {
        String string = "";
        switch (cell.getCellTypeEnum()) {
            case STRING:
                string = cell.getRichStringCellValue().getString();
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    string = cell.getDateCellValue().toString();
                } else {
                    string = Double.toString(cell.getNumericCellValue());
                }
                break;
            case BOOLEAN:
                string = Boolean.toString(cell.getBooleanCellValue());
                break;
            case FORMULA:
                string = Double.toString(cell.getNumericCellValue());
                break;
            default:
        }
        return string;
    }
}
