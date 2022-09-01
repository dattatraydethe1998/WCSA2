package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {



	public static void main(String[] args) throws InterruptedException{

		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser name,chrome or firefox");
		String browservalue = sc.nextLine();

		if(browservalue.equalsIgnoreCase("chrome"))
		{

			System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
		}
		else if(browservalue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("Webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			Thread.sleep(5000);

		}
		else
		{
			System.out.println("Invalid input");
		
		}

	

}
}
