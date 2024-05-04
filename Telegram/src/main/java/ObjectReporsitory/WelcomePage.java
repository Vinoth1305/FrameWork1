package ObjectReporsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	@FindBy(partialLinkText ="BOOKS")
	private WebElement booksLink;
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apparelspage;
	
	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getApparelspage() {
		return apparelspage;
	}

}
