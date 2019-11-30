package autmproj;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CloudTesting {

		//@Test
		
public void setup(){
	
	
	DesiredCapabilities dc = DesiredCapabilities.firefox();
	dc.setCapability("version", "5");
	dc.setCapability("platform", "XP");
	
	//WebDriver driver = new RemoteWebDriver(new URL("http://saucelabsid:AccessKey@ondemand.saucelabs.com:80/wd/hub", dc);
	
//	driver.get("http://google.com");
	//System.out.println(driver.getTitle());

	

		
	}

}
