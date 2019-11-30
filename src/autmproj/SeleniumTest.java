package autmproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class SeleniumTest {

	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		
		PropertiesFile.readPropertiesFile();
		PropertiesFile.writePropertiesFile();
		//setBrowser();
		setBrowserConfig();
		runTest();

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\syed\\Downloads\\geckodriver-v0.18.0-win32");

		//WebDriver driver = new FirefoxDriver();

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();

		//driver.get("http:\\gradelink.com");

		//driver.quit();

	}
	public static void setBrowser(){
		browser = "Firefox" ;

	}
	public static void setBrowserConfig(){
		if (browser.contains("Chrome")){

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			if (browser.contains("Firefox")){ //giving nullpointerexception
				
				
				driver = new FirefoxDriver();	
			}
		}

	}


	public static void runTest(){
		driver.get("http:\\gradelink.com");

		driver.quit();


	}
}
