package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersSample {
	
	
	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		//to maximize the window
		driver.manage().window().maximize();
		
		
		//click on Gmail link
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("ai")).click();
		
		
		driver.get("https://www.bestbuy.com/identity/signin?token=tid%3Ad1c24e39-66fa-11e9-a042-005056aedf5a");
		//click on sign button
		driver.findElement(By.xpath("/html/body/div[1]/section/main/div[1]/div[1]/div/div/form/button")).click();
		
		
		
		
	}

}
