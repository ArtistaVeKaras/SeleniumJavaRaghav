package util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelUtils {

  static XSSFWorkbook workbook;
  static XSSFSheet sheet;

  /**
   * Constructor takes two parameters
   * @param sheetName the name of the excel sheet to be used
   * @param excelPath the path of the excel sheet
   * @throws IOException Throws an IOException
   */
  public ExcelUtils(String sheetName, String excelPath) throws IOException {
    workbook = new XSSFWorkbook(excelPath);
    sheet = workbook.getSheet(sheetName);
  }

  /**
   * Get number of rows in the Excel sheet
   * @param rowNum extract the number of rows
   */
  public static int getRowCount(int rowNum){
    int rowCount = 0;
    try {
      rowCount = sheet.getPhysicalNumberOfRows();
      sheet.createRow(rowNum);
      System.out.println("Number of rows: " +rowCount);

    }catch(Exception  e){
      System.out.println(e.getMessage());
      System.out.println(e.getCause());
      e.printStackTrace();
    }
    return rowCount;
  }

  /**
   * Get column count in the excel sheet
   * @param colNum extract the number of columns
   */
  public static int getColCount(int colNum){
    int colCount = 0;
    try {
      colCount = sheet.getRow(colNum).getPhysicalNumberOfCells();
      System.out.println("Number of cols: " +colCount);

    }catch(Exception  e){
      System.out.println(e.getMessage());
      System.out.println(e.getCause());
      e.printStackTrace();
    }
    return colCount;
  }

  /**
   * Gets the value from cell(s) as a String
   * @param rowNum rowNumber to extract data from
   * @param cellNum cell Number to extract the date from.
   *                Prints Password
   */
  public static String getCellStringData(int rowNum, int cellNum){
    String cellData=null;
    try {
      cellData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
      System.out.println(cellData);

    }catch(Exception e){
      System.out.println(e.getMessage());
      System.out.println(e.getCause());
      e.printStackTrace();
    }
    return cellData;
  }

  /* 1- In all excel functions use rowNum, colNum as parameters
  * This is to avoid hard coding of values and get values from calling
  * functions.
  *
  * 2-Create a constructor a constructor is a special method without
  * any return type and name as the class name
  * Constructor is called every time a class object is created using the new() keyword
  * */

  /**
   * Get the numeric (e.g int, double) value from cell row
   * @param rowNum data to be extracted as int or double
   * @param cellNum to select data to be extracted from
   */
  public static void getNumericCellData(int rowNum, int cellNum){

    try {
      double getRowCell = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
      System.out.println("The numeric value is: "+ getRowCell);

    }catch(Exception e){
      System.out.println(e.getMessage());
      System.out.println(e.getCause());
      e.printStackTrace();
    }
  }
}
