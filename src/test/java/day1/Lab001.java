package day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab001 {

	WebDriver driver; // Declare at class level

	@BeforeClass
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Initialize once
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void launchBrowser() {
		driver.get("https://financialservices.gov.in/beta/en/banking-overview");
		System.out.println(driver.getTitle());

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(driver.getTitle().contains("Banking"), "Title does not contain 'Banking'");
		softAssert.assertAll(); // Important!
	}

	@AfterTest
	public void test2() {
		System.out.println(driver.getPageSource());
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit(); // Close browser after tests
		}
	}
}