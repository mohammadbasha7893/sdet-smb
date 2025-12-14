package Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab001 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.operadriver().setup();
	}

}
