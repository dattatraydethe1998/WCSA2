package KeyWordDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestActiTimeDropdownOps {

	private static final String PROP_PATH = null;
	private static Object driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseTest bt = new BaseTest();
		bt.openBrowser();//open the browser
		Flib flib = new Flib();
		//read the data from property file
		String username = flib.readPropertFile(PROP_PATH,"username");
		String password = flib.readPropertFile(PROP_PATH,"password");

		driver;
		//valid login
		driver.findElement(By.name("username")).sendKeys(username);
		((WebDriver) driver).findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.id("loginButton")).click();
		((By) driver).findElement(By.partialLinkText("Settings")).click();
		
		WebElement dropdown1 = driver.findElement(By.name("firstHierarchyLevelCode"));
		
		WebDriver wb = new WebDriver();
		wb.getAllOptionsOfDropdown(dropdown1);
		
		System.out.println("____________________________");
		
		WebElement dropdown2 = driver.findElement(By.name("secondHierarchyLevelCode"));
		((wb) wb).getAllOptionsOfDropdown(dropdown2);
	}

}
