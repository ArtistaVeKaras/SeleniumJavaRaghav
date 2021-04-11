package util;


import org.apache.logging.log4j.core.util.JsonUtils;

import java.io.IOException;

public class ExcelDataProvider {


    public static void main(String[] args) throws IOException {

        String path = "Excel/data.xlsx";
        testData("Sheet1", path);
    }

    public static void testData(String sheetName, String excelPath) throws IOException {

        ExcelUtils excel = new ExcelUtils(sheetName, excelPath);

        int rowCount = excel.getRowCount(0);
        int colCount = excel.getColCount(0);

        /* Create a nested for loop to iterate
         * through columns and the rows in excel sheet
         */
        for (int i = 1; i<rowCount; i++){
            for (int j = 0; j<colCount; j++) {

                String excelData = excel.getCellStringData(i, j);
                System.out.print(excelData);
            }
        }
    }
}
