package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ncalculators.com/interest/simple-interest-calculator.htm");
		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//get the data from Principal Amount edit box
		System.out.println("program start");
		//System.out.println(driver.findElement(By.id("amount")).getText());
		//GetAttribute: get the value from HTML code ( Developer Window)
		System.out.println(driver.findElement(By.id("amount")).getAttribute("value"));
		System.out.println("program end");

		//clear the Editbox data and enter manully any value, then check the same value has stored into value attribute or not?
		//to clear the data
		driver.findElement(By.id("amount")).clear();
		driver.findElement(By.id("amount")).sendKeys("7896");
		Thread.sleep(3000);
		System.out.println("*****************************");
		System.out.println(driver.findElement(By.id("amount")).getAttribute("value"));
	}

}
