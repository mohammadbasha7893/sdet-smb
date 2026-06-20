package DSA; // Package declaration (organizes your classes)

import java.time.Duration;

import org.openqa.selenium.WebDriver; // Import WebDriver interface
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver class

public class lab002 {
	public static void main(String[] args) {
		// Launch a new Chrome browser instance
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open the Selenium official website
		driver.get("https://www.selenium.dev/");

		// Get the current URL of the page
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + getCurrentUrl);

		// Get the title of the page
		String getTitle = driver.getTitle();
		System.out.println("Page Title: " + getTitle);

		// Get the page source (HTML content of the page)
		String getPageSource = driver.getPageSource();
		System.out.println("Page Source Length: " + getPageSource.length());
		// Printing the entire source can be very long, so here we log its length

		// Close the current browser window
		driver.close();
	}
}
