package pom3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@FindBy(xpath = "(//a[contains(text(),'Bike Insurance')])[1]")
	WebElement personlloan;

	// methods

	public void aadhar() throws InterruptedException {
		user.click();
		Thread.sleep(10000);

	}

	public void pl(WebDriver driver) {
	    // Create WebDriverWait (10 seconds timeout)
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait until element is clickable
	    wait.until(ExpectedConditions.elementToBeClickable(personlloan));

	    // Now click safely
	    personlloan.click();

	    // Wait until element is visible (optional, if you want text after click)
	    wait.until(ExpectedConditions.visibilityOf(personlloan));

	    System.out.println(personlloan.getText());
	}

}
