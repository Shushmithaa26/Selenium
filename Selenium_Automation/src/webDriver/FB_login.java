package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FB_login {

	public static void main(String[] args) throws Exception {

		//create webdriver reference name
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		//driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testing@gmail.com");
		//type password
		driver.findElement(By.name("pass")).sendKeys("testing123");
	
		
		//Login button click
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		
		//validate CREATE ACCOUT button is displayed or not?
		boolean createAccount = driver.findElement(By.xpath("//*[contains(@class,'signup_btn')]")).isDisplayed();
		
		if (driver.findElements(By.xpath("//*[contains(@class,'signup_btn')]")).size()>0) {
			System.out.println("Given credentials are invalid");
		} else {
			System.out.println("Given credentials are valid");
		}
		
		//to close the window
		driver.close();
		
	}

}
