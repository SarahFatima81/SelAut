package autmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\udemy.com");
		driver.findElement(By.xpath(".//*[@id='udemy']/div[2]/div[1]/div[4]/div[1]/div[1]/a")).click();
	}

}
