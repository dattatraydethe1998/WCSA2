package KeyWordDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class TestvalidActiTime extends BaseTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.openBrowser();//open the browser
		Flib flib = new Flib();
		//read the data from property file
		String username = flib.readPropertFile("./data/config.properties","username");
		String password = flib.readPropertFile("./data/config.properties","password");

		
		//valid login
		((Object) driver.findElements(By.name("username"))).sendKeys(username);
		driver.findElements((By) By.name("pwd")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElements(By.id("loginButton")).click();
		
		bt.openBrowser();//close all browsers
		
		
	}

}
