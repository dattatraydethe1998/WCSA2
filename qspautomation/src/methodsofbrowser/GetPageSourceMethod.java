package methodsofbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//1
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/wcsa2htmldocs/checkbox.html");
		String sourceCodehtml= driver.getPageSource();//3
		System.out.println(sourceCodehtml);//4
	}

}
