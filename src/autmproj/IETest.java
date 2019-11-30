package autmproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\syed\\Desktop\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http:\\gradelink.com");
	}

}
