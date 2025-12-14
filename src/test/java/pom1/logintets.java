package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintets {

	WebDriver driver;

	@BeforeClass

	void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test

	void testlogin() {
		
		loginpage li=new loginpage(driver);
		li.setusername("Admin");
		li.setusername("admin123");
		li.buttonclick();
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		

	}

	@AfterClass

	void teardown() {
		driver.quit();

	}

}
