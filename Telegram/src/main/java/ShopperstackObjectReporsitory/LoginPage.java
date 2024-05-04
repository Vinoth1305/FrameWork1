package ShopperstackObjectReporsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(linkText = "Login")
	//@FindBy(xpath = "//button[@class='navbar_Loginbutton__O9-64']")
	private WebElement loginwelcomebutton;
	
	@FindBy(xpath= "//a[@href='/user-signin']")
	private WebElement loginpagemessage;
		
	@FindBy(id = "Email")
	private WebElement emailtextfield;
	
	@FindBy(id = "Password")
	private WebElement passwordtextfield;
	
	@FindBy(linkText = "Login")
	private WebElement loginbutton;
	
	@FindBy(linkText = "Create Account")
	private WebElement createaccountbutton;
	
	@FindBy(id = "Forgot Password?")
	private WebElement forgotpasswordbutton;
	
	@FindBy(xpath = "//a[@href='/forgot']")
	private WebElement forgotpasswordmessange;
	
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")
	private WebElement emailfield;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement proceedbutton;
	
	public WebElement getLoginwelcomebutton() {
		return loginwelcomebutton;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getCreateaccountbutton() {
		return createaccountbutton;
	}

	public WebElement getForgotpasswordbutton() {
		return forgotpasswordbutton;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getProceedbutton() {
		return proceedbutton;
	}

	public WebElement getLoginpagemessage() {
		return loginpagemessage;
	}

	public WebElement getForgotpasswordmessange() {
		return forgotpasswordmessange;
	}
	
}