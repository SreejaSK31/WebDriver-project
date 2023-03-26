package SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.saucedemo.com/");
	

}
}