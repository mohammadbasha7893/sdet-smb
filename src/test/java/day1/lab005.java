package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class lab005 {
	WebDriver driver;

	@BeforeClass
	public void browsersetup() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void songplaying() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement search = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,\"search_query\")]")));
		search.sendKeys("omi", Keys.ENTER);
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

      
        List<WebElement> elements = driver.findElements(
            By.xpath("//div[@class='style-scope ytd-video-renderer']")
        );
        wait1.until(ExpectedConditions.invisibilityOfAllElements(elements));

        // 2. After invisibility, wait for a button to be clickable
        WebElement targetButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[@class='style-scope ytd-video-renderer']") // example locator
        ));

        // 3. Click the button
        targetButton.click();

	}

}
