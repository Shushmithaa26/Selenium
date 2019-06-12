package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods_Sample {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.collegeweeklive.com/go-signup/");
				
		//implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// get the current url
		System.out.println("Page URL is: "+driver.getCurrentUrl());
	
		//get the page title
		System.out.println("page title is: "+ driver.getTitle());
		

		//without enter any details clicks on Submit button
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		
		//click on Refresh icon 
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		
		
		
		
	}

}
