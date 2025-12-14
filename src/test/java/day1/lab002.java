package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class lab002 {

	WebDriver driver;

	@BeforeClass
	public void lunch( ){
		 driver =new ChromeDriver();
	}

	@Test
	public void testrun() {
		
		driver.get("");

	}

}
