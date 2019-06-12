package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_GetAttribute {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//get the google imgae hieght and width
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("height"));
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("width"));
		
		
	}
}
