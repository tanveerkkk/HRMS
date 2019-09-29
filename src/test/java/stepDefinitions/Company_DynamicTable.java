package stepDefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Company_DynamicTable {

	public static void main(String[] ar) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\trial2\\HRMS\\drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");

		driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//table[@class='dataTable']"));

		List<WebElement> tableRows = element.findElements(By.tagName("tr"));

		for (int row = 0; row < tableRows.size(); row++) {

			List<WebElement> rowColumn = tableRows.get(row).findElements(By.tagName("td"));

			for (int col = 0; col < rowColumn.size(); col++) {
				System.out.println(rowColumn.get(col).getText());
			}
			System.out.println();
		}
	}
}
