package autmproj;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestingOnRemoteMachines {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver;
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\syed\\Downloads\\geckodriver-v0.18.0-win32");

		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		//capabilities.setCapability(ChromeDriver.BINARY, new File("C:\\Users\\306249\\AppData\\Local\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		capabilities.setBrowserName("chrome");
		capabilities.setCapability("platform", "Windows 10");
		
		driver = new RemoteWebDriver(new URL("http://10.0.0.200:5566/wd/hub"),capabilities);
		
		driver.get("http://wwww.google.com");
		System.out.println(driver.getTitle());
	}

}
