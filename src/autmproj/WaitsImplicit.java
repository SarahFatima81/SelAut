package autmproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsImplicit {

	public static void main(String[] args) {
       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.xpath(".//*[@id='tab-hotel-tab']")).click();
		driver.findElement(By.id("hotel-destination")).sendKeys("nyc");
		driver.findElement(By.id("hotel-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("hotel-checkin")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(".//a[contains(@href, 'New-York-Hotels-')]")).click();
		
		
		

  
	}

}
