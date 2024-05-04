package Testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectReporsitory.BooksPage;
import ObjectReporsitory.WelcomePage;

public class BookTest {
	@Test
public void books_001() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WelcomePage welcomepage=new WelcomePage(driver);
	BooksPage bookspage=new BooksPage(driver);
	
	welcomepage.getBooksLink().click();
	String actualResult=bookspage.getBooksTitle().getText();
	//hardassert
	//Assert.assertEquals(actualResult, "Books");
	//if else statement
//	if(bookspage.getBooksTitle().getText().equals("Computers")) {
//	    System.out.println("Test case pass");}
//	    else {
//	    	System.out.println("Test case Failed");
//	    }
	//softassert
	SoftAssert soft=new SoftAssert();
	//soft.assertEquals(actualResult, "Computers");
	//soft.assertNotEquals(bookspage.getBooksTitle().isDisplayed(),true  );
	//soft.assertTrue(bookspage.getBooksTitle().isDisplayed());
	soft.fail();
	soft.assertFalse(bookspage.getBooksTitle().isDisplayed());
	driver.quit();
	soft.assertAll();
}                                                                                                                                                                                              
	}