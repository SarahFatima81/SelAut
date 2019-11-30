package autmproj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakingScreenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr, new File("c:\\tmp\\screenshot.png"));
	}

}
