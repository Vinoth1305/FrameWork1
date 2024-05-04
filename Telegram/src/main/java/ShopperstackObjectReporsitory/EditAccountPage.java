package ShopperstackObjectReporsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {
public EditAccountPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[name()='svg'][@data-testid='AddPhotoAlternateOutlinedIcon']")
private WebElement profilepic;

@FindBy(xpath = "//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-2duac4']")
private WebElement choosefilebutton;

@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall  css-jhxgbr']")
private WebElement uploadbutton;

@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium  css-t2wvjf']")
private WebElement editaccountbutton;

@FindBy(xpath = "//input[@aria-invalid='false']")
private WebElement firstnameedittextfiled;

@FindBy(id = "submit")
private WebElement submitbutton;

@FindBy(xpath = "//div[.='My Addresses']")
private WebElement myaddressbutton;

public WebElement getProfilepic() {
	return profilepic;
}

public WebElement getChoosefilebutton() {
	return choosefilebutton;
}

public WebElement getUploadbutton() {
	return uploadbutton;
}

public WebElement getEditaccountbutton() {
	return editaccountbutton;
}

public WebElement getFirstnameedittextfiled() {
	return firstnameedittextfiled;
}

public WebElement getSubmitbutton() {
	return submitbutton;
}

public WebElement getMyaddressbutton() {
	return myaddressbutton;
}

	
}
