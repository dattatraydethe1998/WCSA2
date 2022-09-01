package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement link1 = driver.findElement(By.partialLinkText("flip"));
		link1.click();

		

		//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//			WebDriver driver=new ChromeDriver();
		//			driver.manage().window().maximize();
		//		driver.get("https://www.selenium.dev/");
		//		WebElement link1 = driver.findElement(By.partialLinkText("flip"));
		//		link1.click();



	}

}
