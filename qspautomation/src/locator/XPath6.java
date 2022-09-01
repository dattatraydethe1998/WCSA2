package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath6 {
	//flipkard.com
	private static String priceofsamsungf22;

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders%3Flink%3Dhome_orders&fromMyOrdersPage=true");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung f22");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String priceofsamsungf22 = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Black, 128 GB)']/ancestor::div[@class='col col-7-12']/descendant::div[@class='_3pLy-c row']")).getText();

		System.out.println("price of samsung f22 : "+priceofsamsungf22);
	}


}
