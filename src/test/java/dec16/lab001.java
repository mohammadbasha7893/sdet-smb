package dec16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab001 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement se = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
		Select sd = new Select(se);
		sd.selectByIndex(1);
		System.out.println(sd.getFirstSelectedOption().getText());

		// id="country"

		

		WebElement se2 = driver.findElement(By.xpath("//select[@id='country']"));
		Select countryDropdown = new Select(se2);
		countryDropdown.selectByVisibleText("India");    // line causing error

	}

}
