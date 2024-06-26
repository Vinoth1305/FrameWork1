package genericlibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectReporsitory.LoginPage;
import ObjectReporsitory.WelcomePage;

public class BaseClass extends UtilityMethods {

	public WebDriver driver;
	public static  ExtentReports report;
	public static  ExtentTest test;
	@BeforeSuite
	public void bs() {
		 report=new ExtentReports("./Reports/report.html");
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("Before test");
	}
	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Before class");
	}
	@BeforeMethod
	public void login(Method method) {
		String methodName=method.getName();
		test=report.startTest(methodName);
		WelcomePage welcome=new WelcomePage(driver);
		
		LoginPage login=new LoginPage(driver);
		welcome.getLoginlink().click();
		
		login.getEmailTF().sendKeys("nandanms@gmail.com");
		login.getPasswordTF().sendKeys("nandan@1234");
		
		login.getLoginButton().click();
		
		System.out.println("Before method");
	}
	
	
	@AfterSuite
	public void as() {
		
		report.flush();
		System.out.println("After suite");
	}
	
	@AfterTest
	public void at() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
		System.out.println("After class");
	}
	
	@AfterMethod
	public void logout() {
		report.endTest(test);
		WelcomePage welcoome=new WelcomePage(driver);
		
		welcoome.getLoginlink().click();
		System.out.println("After method");
	}
	
}
