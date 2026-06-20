package jun20;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab002 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://degreed.com/account/login?ReturnUrl=%2Fdguserlel7173%2Fdashboard");
		driver.findElement(By.id("username")).sendKeys("abcd");
		driver.findElement(By.xpath("//div[@class='rel guts-p-v-1\']")).click();

	}

}
