package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//click on Create new Account
		
		WebElement signUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signUp.click();
		
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
				
		fName.sendKeys("Sreeja");
		lName.sendKeys("Kurup");
		mobile.sendKeys("99999999999");
		password.sendKeys("Sreeja@2013");
		
		WebElement Defaultday = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("The default day is " +Defaultday.getText());
		
		List<WebElement> list = driver.findElements(By.xpath("//select[@aria-label='Month']/option"));
		for(WebElement Month :list) {
			System.out.println(Month.getText());
		}
								
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay= new Select(day);
		ddDay.selectByVisibleText("12");
		
		WebElement Mon = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select mmMon= new Select(Mon);
		mmMon.selectByVisibleText("Mar");
		
		WebElement Year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select yyYear= new Select(Year);
		yyYear.selectByVisibleText("1991");
		
		WebElement Sex = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		Sex.click();
		
		String Gender ="Female";
		String genderXpath = "//label[text()='Placeholder']";
		String newXpath = genderXpath.replace("Placeholder", Gender);
		System.out.println("New Xpath is"+newXpath);
		
		//WebElement SignUp = driver.findElement(By.xpath("//button[@name='websubmit']"));
		//SignUp.click();

		
	}

}

