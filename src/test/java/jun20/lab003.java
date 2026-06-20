package jun20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab003 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://degreed.com/account/login?ReturnUrl=%2Fdguserlel7173%2Fdashboard");
		String title = driver.getTitle();
		String actual = driver.findElement(By.xpath("//title[text()='Log In | Degreed']")).getText();
		if (title.equals(actual)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		driver.quit();
	}

}
