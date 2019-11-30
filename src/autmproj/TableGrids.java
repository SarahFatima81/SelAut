package autmproj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableGrids {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/series/8037/scorecard/415281/html");//could not run - error
		
             WebElement table = driver.findElement(By.id("inningsBat1"));
             List<WebElement>noofrows = table.findElements(By.tagName("tr"));
             System.out.println("no of rows are"+ noofrows.size());
             
             for(WebElement eachRow:noofrows){
            	 int i = 0;
            	 List<WebElement>eachcolumn = eachRow.findElements(By.tagName("td"));
            	 i++;
            	 System.out.println("No. of columns in" + i + "row are" + eachcolumn.size());
            	 
            	 for(WebElement text:eachcolumn){
            		 System.out.println(text.getText());
            	 }
             }
             
	}

}
