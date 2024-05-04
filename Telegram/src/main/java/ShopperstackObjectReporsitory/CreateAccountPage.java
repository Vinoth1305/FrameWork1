package ShopperstackObjectReporsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
public CreateAccountPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[@href='/signup']")
private WebElement signupmessage;

@FindBy(id = "First Name")
private WebElement fntextfield;

@FindBy(id = "Last Name")
private WebElement lntextfield;

@FindBy(id = "Male")
private WebElement maleradiobutton;

@FindBy(id = "Phone Number")
private WebElement pnotextfield;

@FindBy(id = "Email Address")
private WebElement emtextfield;

@FindBy(id = "Password")
private WebElement patextfield;

@FindBy(id = "Confirm Password")
private WebElement cptextfield;

@FindBy(id = "Terms and Conditions")
private WebElement teamsandconditionbutton;

@FindBy(id = "btnDisabled")
private WebElement registerbutton;

public WebElement getFntextfield() {
	return fntextfield;
}

public WebElement getLntextfield() {
	return lntextfield;
}

public WebElement getMaleradiobutton() {
	return maleradiobutton;
}

public WebElement getPnotextfield() {
	return pnotextfield;
}

public WebElement getEmtextfield() {
	return emtextfield;
}

public WebElement getPatextfield() {
	return patextfield;
}

public WebElement getCptextfield() {
	return cptextfield;
}

public WebElement getTeamsandconditionbutton() {
	return teamsandconditionbutton;
}

public WebElement getRegisterbutton() {
	return registerbutton;
}

public WebElement getSignupmessage() {
	return signupmessage;
}
}
