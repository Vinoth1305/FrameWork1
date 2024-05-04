package ObjectReporsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this );
}
	@FindBy(id = "Email")
	private WebElement EmailTF;
	
	@FindBy(id = "Password")
	private WebElement PasswordTF;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement LoginButton;

	public WebElement getEmailTF() {
		return EmailTF;
	}

	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
}

