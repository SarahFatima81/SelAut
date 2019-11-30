package autmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBLogIn {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("safa79us@hotmail.com");
		driver.findElement(By.name("pass")).sendKeys("MZak200");
		//driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();

	}

}
