package autmproj;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		Set<Cookie>abc = driver.manage().getCookies();
		System.out.println(abc.size());
	    driver.manage().deleteAllCookies();
		Set<Cookie>abcd = driver.manage().getCookies();
		System.out.println(abcd.size());
		

	}

}
