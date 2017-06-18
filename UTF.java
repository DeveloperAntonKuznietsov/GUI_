package com.company;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UTF {
    Scanner fileReade;
    List<String> list = new ArrayList<String>();



    public UTF(String s)throws Exception{


         try {
             fileReade = new Scanner(new File(s));
         }
        catch (Exception e){
             JOptionPane.showMessageDialog(null,"Ups");
         }

            while (fileReade.hasNext()){
                list.add(fileReade.next());
          }
          for (int i=0;i<list.size();i++){
              System.out.println(list.get(i));}
          PrintWriter printWriter = new PrintWriter("prin.csv");
        for (int i = 0; i <list.size() ; i++) {
            printWriter.write(list.get(i));
        }

    }

}
