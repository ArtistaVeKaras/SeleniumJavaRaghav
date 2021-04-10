package util;

import java.io.IOException;

public class ExcelUtilDemo {

    public static void main(String[] args) throws IOException {

        //This is useful if used in another user pc
//        String projectpath = System.getProperty("user.dir");

        ExcelUtils excel = new ExcelUtils("Sheet1","Excel/data.xlsx");
//        excel.getRowCount(0);
//        excel.getStringCellData(0,0); //prints username
//        excel.getStringCellData(0,1); //prints password
//        excel.getNumericCellData(1,1); //prints 1234.0
        excel.getColCount(1);
    }
}
