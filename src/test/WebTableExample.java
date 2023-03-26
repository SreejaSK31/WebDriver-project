package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		List<WebElement> rows = driver.findElements(By.cssSelector("table#customers>tbody>tr"));
		System.out.println("Rows are " + rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		System.out.println("columns are " + columns.size());
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[2]"));
		System.out.println("data is " + data.getText());

		for (int i = 2; i <= rows.size(); i++) {
			List<WebElement> ColumnsData = driver
					.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"));

			System.out.println(ColumnsData.get(0).getText() + " " + ColumnsData.get(1).getText() + " "
					+ ColumnsData.get(2).getText());
		}

	}

}

//for finding any data in a single cell
//td[text()='Alfreds Futterkiste']/following-sibling::td[2]