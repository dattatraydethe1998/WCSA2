package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLOginButton {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=1fcnebtc96im2");

		Flib flib = new Flib();
		String username = flib.readExceldata("./Data/TestDataAct.xlsx","validcread",1,0);
		String Passward = flib.readExceldata("./Data/TestDataAct.xlsx","validcread",1,1);


		driver.findElement (By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement (By.name("password")).sendKeys("manager");

		driver.findElement (By.id("loginButton")).click();

	}

}
