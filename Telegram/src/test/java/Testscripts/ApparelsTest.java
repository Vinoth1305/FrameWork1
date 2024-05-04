package Testscripts;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ObjectReporsitory.ApparelsPage;
import ObjectReporsitory.WelcomePage;

public class ApparelsTest {
@Test
public void appreal_001() {
	WelcomePage welcome=new WelcomePage(Driver);
	
	ApparelsPage apparel=new ApparelsPage(Driver);
	
	welcome.getApparelspage().click();
	test.log(LogStatus.INFO,"clicked on apparels link");
	Assert.assertEquals(apparel.getApparelstitle().getText(), "Apparel & Shoes");
	test.log(LogStatus.PASS, "Apparels page is displayed");

	
}
}
