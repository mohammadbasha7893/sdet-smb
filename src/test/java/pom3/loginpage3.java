package pom3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage3 {

	WebDriver driver;

	// constructors

	  public loginpage3(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	// locators

	@FindBy(xpath = "//span[contains(text(),'Personal')]")
	WebElement user;

	// methods

	public void aadhar() {
		user.click();
	}
}
