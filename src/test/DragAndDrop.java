package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		WebElement from = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		Actions obj = new Actions(driver);
		obj.sendKeys(Keys.PAGE_DOWN);
		obj.moveToElement(from).build().perform();
		Thread.sleep(6000);
		obj.dragAndDrop(from, to).build().perform();
		
	//	WebElement Amtfrom = driver.findElement(By.xpath("//li[@id=\"fourth\"]']"));
		//WebElement Amtto = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		//obj.dragAndDrop(from, to).build().perform();
		
	}

}
