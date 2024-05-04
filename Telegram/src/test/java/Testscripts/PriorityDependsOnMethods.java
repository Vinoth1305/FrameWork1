package Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDependsOnMethods{
@Test (groups = "smoke")//(priority=0)
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.quit();
	}
@Test(groups = "smoke")//(dependsOnMethods = "register")
    public void login() {
    	WebDriver driver=new ChromeDriver();
    	System.out.println("Login");
    	driver.quit();
    }
@Test (groups = "smoke")//(dependsOnMethods = "login")
    public void addtocart() {
    	WebDriver driver=new ChromeDriver();
    	System.out.println("Add To Cart");
    	driver.quit();    	
    }
@Test//(dependsOnMethods = "addtocart")
    public void payment() {
    	WebDriver driver=new ChromeDriver();
    	System.out.println("Payment");
    	driver.quit();
    }
@Test//(dependsOnMethods = "payment")
    public void confirmorder() {
    	WebDriver driver=new ChromeDriver();
    	System.out.println("ConfirmOrder");
    	driver.quit();
    }
}

