package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Core i5' and @class='_3879cV']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Brand' and @class='_2gmUFU _3V8rao']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='HP' and @class='_3879cV']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Operating System' and @class='_2gmUFU _3V8rao']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Windows 10' and @class='_3879cV']")).click();
		Thread.sleep(3000);
		String priceOfTheFirstSuggestion = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='col col-7-12']/descendant::div[@class='_3pLy-c row']")).getText();
		System.out.println("price of the first suggestion "+priceOfTheFirstSuggestion);
	}


}
