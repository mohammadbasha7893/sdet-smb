package dec16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab002 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e\"])[2]")).click();
		int a = 1;
		while (a < 5) {
			driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
			a++;
		}
		driver.findElement(By.xpath("(//div[@class=\"css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e\"])[2]")).click();

		System.out.println(driver
				.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).getText());
	}

}
