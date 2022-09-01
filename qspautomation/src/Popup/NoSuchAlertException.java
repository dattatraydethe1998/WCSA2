package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchAlertException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/QSP/Desktop/wcsa2htmldocs/Confirmation.html");
		driver.findElement(By.xpath("//button[contains(text(),'Hungry')]")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		
		al.getText();
		
	}

}
