package WebElementMethods;

import java.awt.Dimension;
import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		WebElement loginButton = driver.findElement(By.name("login"));
		org.openqa.selenium.Rectangle rect = loginButton.getRect();
		
		System.out.println("width :"+rect.getWidth());
		System.out.println("height :"+rect.getHeight());
		System.out.println("xaxis :"+rect.getX());
		System.out.println("yaxis:"+rect.getY());
		
		
		org.openqa.selenium.Dimension size = loginButton.getSize();
		int height1 = size.getHeight();
		int width1 = size.getWidth();
		System.out.println(height1);
		System.out.println(width1);
		
	}

}
