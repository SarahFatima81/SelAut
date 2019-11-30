package autmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElemtValidn {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://makemytrip.com");
	
		System.out.println("Before selecting Multicity");
		System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());//isEnabled/isDisabled can also
		//be used to show if return tab is enabled or disabled(isDisabled removed from Selenium 3.0)
		//driver.findElement(By.xpath(".//*[@id='multicity']/label")).click();
		//System.out.println("After selecting multicity");
		//System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		
		driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
		driver.findElement(By.xpath(".//*[@id='fd-wrap']/div[2]/h2")).click();
		driver.findElement(By.xpath(".//*[@id='fd-wrap']/div[2]/h2")).click();
		
		  driver.findElement(By.xpath(".//*[@id='hp-widget__paxCounter']")).click();
			driver.findElement(By.xpath(".//*[@id='js-adult_counter']/li[6]")).click();
			
			
		
		
	
		
		
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='fd-wrap']/div[2]/h2")).getText());
		
		//int count = driver.findElements(By.xpath(".//*[@id='hp-wiget__return']")).size();
		
		//if(count == 0){
			
			//System.out.println("verified");
		}

	}


