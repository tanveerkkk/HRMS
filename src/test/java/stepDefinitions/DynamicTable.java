package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicTable {

	public static void main(String[] ar) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\trial2\\HRMS\\drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");

		driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/table.html");

		driver.close();
		Thread.sleep(3000);
		driver.quit();

	}
}
