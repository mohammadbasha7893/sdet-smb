package pom3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1 extends basetest {
	

	@Test
	public void test1() {
		loginpage3 le=new loginpage3(driver);
		le.aadhar();
		
		

	}
}
