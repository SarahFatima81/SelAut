package autmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("[name='login']")).sendKeys("safa79us@hotmail.com");
		
		//driver.findElement(By.cssSelector("[id='password']")).sendKeys("abdce");
		driver.findElement(By.cssSelector("#password")).sendKeys("dsrtf");
		driver.findElement(By.xpath("//input[@name= 'Login']")).click();

	}

}
