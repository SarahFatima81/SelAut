package autmproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandlingHTTPSCert {

	public static void main(String[] args) {

            FirefoxProfile prof = new FirefoxProfile();
            prof.setAcceptUntrustedCertificates(false);
            WebDriver driver = new FirefoxDriver(prof);
            driver.get("http://google.com");
            

	}

}
