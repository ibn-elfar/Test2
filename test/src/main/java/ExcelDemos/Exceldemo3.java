package ExcelDemos;

public class Exceldemo3 {
    public static void main(String[] args) {
        Exceldemo2 excel = new Exceldemo2("Sheet1","C:\\Users\\oawad\\IdeaProjects\\SecondTest\\Excel\\Demo.xlsx");
        excel.GetRowCount();
        excel.GetCellDataString(0,0);
        excel.GetCellDataNumber(1,1);
    }

}
