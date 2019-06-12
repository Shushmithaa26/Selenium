package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FaceBookLogin {
	@Test
	public void fblogin() throws Exception {
		// create webdriver reference name
		WebDriver driver;
				
		System.setProperty("webdriver.edge.driver", ".\\browserDrivers\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
			
		driver.get("https://www.facebook.com/");		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testing@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("testing123");
		WebElement loginbutton  = driver.findElement(By.id("loginbutton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginbutton);
		
		Thread.sleep(3000);

		// validate CREATE ACCOUT button is displayed or not?
		boolean createAccount = driver.findElement(By.xpath("//*[contains(@class,'signup_btn')]")).isDisplayed();
		if (createAccount) {
			System.out.println("Given credentials are invalid");
		} else {
			System.out.println("Given credentials are valid");
		}

		// to close the window
		driver.close();

	}
}
