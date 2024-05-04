package ShopperstackObjectReporsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettings {
public AccountSettings(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//img[@class='MuiAvatar-img css-1hy9t21']")
private WebElement accountsettingbutton;

@FindBy(linkText = "My Profile")
private WebElement myprofilemessage;

@FindBy(xpath = "(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[1]")
private WebElement myprofilebutton;

@FindBy(xpath = "(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[2]")
private WebElement wishlistbutton;

@FindBy(xpath = "(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[3]")
private WebElement myordersbutton;

@FindBy(xpath = "(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[4]")
private WebElement mywalletbutton;

@FindBy(xpath = "(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[5]")
private WebElement mylickesbutton;

@FindBy(xpath = "(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[6]")
private WebElement logoutbutton;

@FindBy(linkText = "wishlist")
private WebElement wishlistmessageElement;

public WebElement getAccountsettingbutton() {
	return accountsettingbutton;
}

public WebElement getMyprofilebutton() {
	return myprofilebutton;
}

public WebElement getWishlistbutton() {
	return wishlistbutton;
}

public WebElement getMyordersbutton() {
	return myordersbutton;
}

public WebElement getMywalletbutton() {
	return mywalletbutton;
}

public WebElement getMylickesbutton() {
	return mylickesbutton;
}

public WebElement getLogoutbutton() {
	return logoutbutton;
}

public WebElement getMyprofilemessage() {
	return myprofilemessage;
}

public WebElement getWishlistmessageElement() {
	return wishlistmessageElement;
}

}
