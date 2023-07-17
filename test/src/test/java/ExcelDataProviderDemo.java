import ExcelDemos.Exceldemo2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderDemo {

    @DataProvider(name="testdata")
    public Object[][] getdata(){
        Object data[][] = testdata("Sheet1","C:\\Users\\oawad\\IdeaProjects\\SecondTest\\Excel\\Demo.xlsx");
        return data;
    }

    @Test(dataProvider = "testdata")
    public void Test(String username, String password){
        System.out.println(username + " || " + password);
    }


    public static Object[][] testdata( String sheetName ,String excelPath ){
        Exceldemo2 excel = new Exceldemo2(sheetName,excelPath);
        int rowcount = excel.GetRowCount();
        int colcount = excel.GetColCount();

        Object data [][] = new Object[rowcount-1][colcount];

        for(int i=1; i<rowcount; i++){
            for(int j=0; j<colcount; j++){
                String celldatastring= excel.GetCellDataString(i,j);
                //System.out.println(celldatastring);
                data[i-1][j]=celldatastring;

            }
        }
        return data;
    }
}
