package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;

public class CommonMethods {

	private WebDriver driver;

	@Given("^User Open the Browser$")
	public void user_Open_the_Browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\trial2\\HRMS\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}

}
