package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=110xk10rvthkg");

		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/TestDataAct.xlsx","invalidcread");
		//C:\Users\Admin\Desktop\WCSA2 Workspace\qspautomation\Data
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExceldata("./Data/TestDataAct.xlsx","invalidcread", i,0);
			String password = flib.readExceldata("./Data/TestDataAct.xlsx","invalidcread", i,1);

			System.out.println(i);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(4000);
			driver.findElement(By.name("username")).clear();
		}



	}

}
