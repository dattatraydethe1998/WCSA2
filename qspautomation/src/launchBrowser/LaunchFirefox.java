package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("Webdriver.gecoko.driver","./drivers/gecKOdriver.exe");
		new FirefoxDriver();

	}

}
