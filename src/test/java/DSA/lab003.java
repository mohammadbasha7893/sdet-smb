package DSA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab003 {
	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open the Selenium official website
		driver.get("https://www.selenium.dev/");

		// Find all navigation items in the menu
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='nav-item mr-4 mb-2 mb-lg-0']"));
		Thread.sleep(1000);

		// Expected menu items
		String[] expected = { "Downloads", "Documentation", "Projects", "Support", "Blog" };

		// Loop through each element found
		for (WebElement w : list) {
			String actualText = w.getText(); // Get the text of the element
			System.out.println("Found: " + actualText);

			// Check if the actual text is in the expected array
			boolean match = false;
			for (String exp : expected) {
				if (actualText.equals(exp)) {
					match = true;
					break;
				}
			}

			// Print result for each item
			if (match) {
				System.out.println("Correct: " + actualText);
			} else {
				System.out.println("Wrong: " + actualText);
			}
		}

		// Close the browser
		driver.close();
	}
}
