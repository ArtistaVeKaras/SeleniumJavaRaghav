package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    /*
    /How to add excel libraries
    How to create excel read function
    GetRowCount
    GetCellData
    How to call excel functions
    Why to use excel file
    In Selenium we can get data from external files like excel and csv
    MS Excel is most commonly used
    Helps to make our scripts independent of data handling
    Helps to add, update, manage data separately (outside the framework)
    Helps to make our framework data driven
    How to add excel libraries
    Download and add Jars
    Add maven dependency
    From : https://mvnrepository.com/artifact/or...

    Step 2
    Check if the libraries are added in your project
    Get Row Count
    Step 1
    Create excel file and add some data
    Step 2
    Create references for Workbook
    for new excel format (xlsx)
    XSSFWorkbook workbook = new XSSFWorkbook(“excel file location”);
    for old excel format (xls)
    HSSFWorkbook workbook = new HSSFWorkbook(“excel file location”);
    Step 3
    Create references for Worksheet
    XSSFSheet sheet = workbook.getSheet(“sheet name”);
    Step 4
    Call row count function
    sheet.getPhysicalNumberOfRows();

    Get Cell Data
Step 1
Create references for Workbook
XSSFWorkbook workbook = new XSSFWorkbook(“excel file location”);
Step 2
Create references for Worksheet
XSSFSheet sheet = workbook.getSheet(“sheet name”);
Step 3
Call function to get cell data
sheet.getRow(rownum).getCell(colnum).getStringCellValue();
sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
         */

    //Global variables to accessed from anywhere
    static String projectPath =  System.getProperty("user.dir");
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void main(String[] args) {
       getRowCount();
    }
    /*
    /Setting the Excel path, Creating a workbook obj that references the name of the sheet
    creating an obj to get the row count of the Excel sheet
     */
    public static void getRowCount(){
        try{
        workbook = new XSSFWorkbook(projectPath+ "/Excel/data.xlsx");// setting the path of the excel file
        sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.print("Number of row: "+rowCount);

    }catch (Exception exp){
            System.out.print(exp.getMessage());
            System.out.print(exp.getCause());
            exp.printStackTrace();

        }
    }
}
