package autmproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutosuggestiveDropDowns {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
		
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("a");
		WebDriverWait wd = new WebDriverWait(driver, 5);
		
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[1]/p")).click();
		

	}

}
