package ShopperstackObjectReporsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
public MyAddressPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-1hw9j7s']")
private WebElement addaddressbutton;

@FindBy(id = "Name")
private WebElement nametextfield;

@FindBy(id = "House/Office Info")
private WebElement infotextfield;

@FindBy(id = "Street Info")
private WebElement info2textfield;

@FindBy(id = "Landmark")
private WebElement landmarktextfield;

@FindBy(id = "Country")
private WebElement countrydropdown;

@FindBy(id = "State" )
private WebElement statedropdown;

@FindBy(id = "City")
private WebElement citydropdown;

@FindBy(id = "Pincode")
private WebDriver pincodetextfield;

@FindBy(id = "Phone Number")
private WebElement phno;

@FindBy(id = "addAddress")
private WebElement addressbutton;

@FindBy(xpath = "(//button[@type='button'])[3]")
private WebElement editaddressbutton;

@FindBy(xpath = "//input[@aria-invalid='false']")
private WebElement editnametextfield;

@FindBy(id = "Update Address")
private WebElement updateaddressbutton;

@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhvu8']")
private WebElement deleteaddressbutton;

@FindBy(xpath = "//button[@class=MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeMedium MuiButton-textSizeMedium  css-1ap6el4']")
private WebElement yespopup;

public WebElement getAddaddressbutton() {
	return addaddressbutton;
}

public WebElement getNametextfield() {
	return nametextfield;
}

public WebElement getInfotextfield() {
	return infotextfield;
}

public WebElement getInfo2textfield() {
	return info2textfield;
}

public WebElement getLandmarktextfield() {
	return landmarktextfield;
}

public WebElement getCountrydropdown() {
	return countrydropdown;
}

public WebElement getStatedropdown() {
	return statedropdown;
}

public WebElement getCitydropdown() {
	return citydropdown;
}

public WebDriver getPincodetextfield() {
	return pincodetextfield;
}

public WebElement getPhno() {
	return phno;
}

public WebElement getAddressbutton() {
	return addressbutton;
}

public WebElement getEditaddressbutton() {
	return editaddressbutton;
}

public WebElement getEditnametextfield() {
	return editnametextfield;
}

public WebElement getUpdateaddressbutton() {
	return updateaddressbutton;
}

public WebElement getDeleteaddressbutton() {
	return deleteaddressbutton;
}

public WebElement getYespopup() {
	return yespopup;
}

}
