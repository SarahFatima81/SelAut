package poiexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow r;
	public static XSSFCell c;
	

	public static void main(String[] args) throws IOException {
		
		String value = getCelldata(5,1);
		System.out.println(value);
		String value1 = getCelldata(2,1);
		System.out.println(value1);
		value = setCelldata(7,1);
		System.out.println(value);
		
		//driver.findElement(By.id("xyz")).sendKeys("value1");
		
		
	}
		
 public static String getCelldata(int rownum, int column) throws IOException{
			
		FileInputStream fis = new FileInputStream("C:\\Users\\syed\\Desktop\\Book2.xlsx");

	
		wb = new XSSFWorkbook(fis);
		 sh = wb.getSheet("script");
		 r = sh.getRow(rownum);
		c = r.getCell(column);
		return c.getStringCellValue();
 }

public static String setCelldata(int rownum, int column) throws IOException{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\syed\\Desktop\\Book2.xlsx");

	
		wb = new XSSFWorkbook(fis);
		 sh = wb.getSheet("script");
		 r = sh.getRow(rownum);
		c = r.getCell(column);
		c.setCellValue("hi");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\syed\\Desktop\\Book2.xlsx");
		wb.write(fos);
		fos.close();
		return c.getStringCellValue();
		
}
}
			



