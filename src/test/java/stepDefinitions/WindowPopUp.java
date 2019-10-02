package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopUp {

	public static void main(String[] ar) throws Exception {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\trial2\\HRMS\\drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");

		driver = new ChromeDriver(options);

		driver.get("http://demo.guru99.com/test/autoit.html");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		driver.switchTo().frame("JotFormIFrame-72320244964454");
		driver.findElement(By.id("input_3")).sendKeys("abc");
		driver.findElement(By.id("input_5")).click();
		Thread.sleep(3000);
					
		Runtime.getRuntime().exec("C:\\Users\\Tanveer\\Desktop\\autoit\\Autoit.exe");

	}
}
