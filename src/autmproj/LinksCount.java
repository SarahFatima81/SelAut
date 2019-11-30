package autmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksCount {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		//System.out.println("Total number of links on page");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.xpath(".//*[@id = 'glbfooter']"));
		
		//System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		//System.out.println(col.findElements(By.tagName("a")).size());
		String beforeClicking = null;
		String afterClicking;
		for (int i =0; i<col.findElements(By.tagName("a")).size();i++){

			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Mobile apps")){
				
				beforeClicking = driver.getTitle();
				
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}	
				
			}
			afterClicking = driver.getTitle();
           if(beforeClicking != afterClicking){
            	if(driver.getPageSource().contains("notified")){
            		System.out.println("PASS");
            		
            	}else{
            	System.out.println("FAIL");
            	}
            }
		}
		//System.out.println(driver.getTitle());
	}


