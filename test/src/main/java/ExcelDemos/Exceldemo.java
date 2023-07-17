package ExcelDemos;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldemo {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    public static void main(String[] args) {
       // GetRowCount();
        GetCellData();

    }

    public static void GetRowCount(){
        try {
            workbook = new XSSFWorkbook("C:\\Users\\oawad\\IdeaProjects\\SecondTest\\Excel\\Demo.xlsx");
            sheet = workbook.getSheet("Sheet1");
            int rowcount = sheet.getPhysicalNumberOfRows();
            System.out.println("the number of rows is "+rowcount);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
    }

    public static void GetCellData(){
        try {
            workbook = new XSSFWorkbook("C:\\Users\\oawad\\IdeaProjects\\SecondTest\\Excel\\Demo.xlsx");
            sheet = workbook.getSheet("Sheet1");
            String CellData = sheet.getRow(0).getCell(0).getStringCellValue();
            System.out.println(CellData);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

    }
}
