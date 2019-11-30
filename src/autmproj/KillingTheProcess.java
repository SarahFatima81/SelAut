package autmproj;

import org.openqa.selenium.os.WindowsUtils;

public class KillingTheProcess {

	public static void main(String[] args) {
		
		WindowsUtils.killByName("notepad.exe");

	}

}
