package Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocatiOnCountThreadPoolSizeTest {
	@Test (invocationCount = 5,threadPoolSize = 2, enabled = false) //(priority=0)
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		Thread.sleep(2000);
		driver.quit();
	}
}
