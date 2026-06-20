package DSA;  // Package declaration (organizes your classes)

import java.time.Duration;  // Import Duration class for timeouts

import org.openqa.selenium.WebDriver;       // Import WebDriver interface
import org.openqa.selenium.chrome.ChromeDriver;  // Import ChromeDriver class

public class lab001 {
    public static void main(String[] args) {
        // Create a new instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        // Set an implicit wait of 10 seconds
        // This tells Selenium to wait up to 10 seconds for elements to appear before throwing an exception
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the browser window
        driver.manage().window().maximize();

        // Close the browser and end the WebDriver session
        driver.quit();
    }
}
