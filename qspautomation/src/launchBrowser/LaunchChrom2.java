package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.Slicing;

public class LaunchChrom2 {

	static
	{
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	}
	public static void main(Slicing[]args)
	{
		new ChromeDriver();
	}
}
