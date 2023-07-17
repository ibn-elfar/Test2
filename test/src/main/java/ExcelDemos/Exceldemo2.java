package ExcelDemos;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldemo2 {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public Exceldemo2(String SheetName, String ExcelPath){
        try {
            workbook = new XSSFWorkbook(ExcelPath);
            sheet = workbook.getSheet(SheetName);
        }
        catch (Exception exp){
            exp.printStackTrace();
        }


    }
    public static void main(String[] args) {
        //GetRowCount();
        //GetCellDataString(0,0);
        //GetCellDataNumber(1,1);

    }

    public static int GetRowCount(){
        int rowcount=0;
        try {

            rowcount = sheet.getPhysicalNumberOfRows();
            System.out.println("the number of rows is "+rowcount);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return rowcount;
    }

    public static int GetColCount() {
        int colcount = 0;
        try {

            colcount = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("the number of colums is " + colcount);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return colcount;
    }


    public static String GetCellDataString(int rowNum, int colNum){
        String CellData = null;
        try {
            CellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            //System.out.println(CellData);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return CellData;

    }

    public static void GetCellDataNumber(int rowNum, int colNum){
        try {
            double CellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            //System.out.println(CellData);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }


    }
}
