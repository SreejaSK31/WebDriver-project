package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement Loginlink = driver.findElement(By.linkText("Log in"));
		String loc = Loginlink.getAttribute("href");
		System.out.println("this is the link to login  " + loc);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		Loginlink.click();

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("sreejaskurup2010@gmail.com");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Anna@20013");
		
		WebElement RemMe = driver.findElement(By.className("rememberMe"));
		RemMe.click();
		
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
		
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		System.out.println("the error message is " + errorMsg);
		
		String expectedErr = "The email or password you have entered is invalid.";
		if (error.isDisplayed() && errorMsg.equals(expectedErr))
		{
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " +AllLinks.size());
		
		for(WebElement All:AllLinks) {
			System.out.println(All.getAttribute("href"));
		}
		driver.close();
	}

}
