package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GertText_Sample {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.collegeweeklive.com/go-signup/");
		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//get the country label name
		String country = driver.findElement(By.xpath("//*[@for='nationality']")).getText();
		System.out.println(country);
		//Click on Submit button without any details
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
		
		
		//get the firstname validation message
		String firstNameErrorMessage = driver.findElement(By.xpath("//*[@id='firstNameError']/span")).getText();
		System.out.println(firstNameErrorMessage);
		
		
		
		
		driver.quit();
		
	}

}
