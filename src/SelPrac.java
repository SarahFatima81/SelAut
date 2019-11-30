import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//System.setProperty("webdriver.chrome.driver", "C://Users//syed//Documents//chromedriver_win32//chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		driver.get("http://www.rediff.com");
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("email");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		driver.findElement(By.name("proceed")).click();


	}

}
