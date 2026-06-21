package jun21; // Package declaration

import java.time.Duration; // Import Duration class for timeouts

import org.openqa.selenium.By; // Import By class for locating elements
import org.openqa.selenium.WebDriver; // Import WebDriver interface
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver class

public class lab001 {
	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to Selenium official website
		driver.navigate().to("https://selenium.dev");

		// Click on the "Downloads" link using XPath
		driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();

		// Navigate back to the previous page
		driver.navigate().back();

		// Pause execution for 20 seconds (to observe the browser action)
		Thread.sleep(20000);

		// Navigate forward to the next page
		driver.navigate().forward();

		// Close the browser at the end of execution
		driver.close();
	}
}
