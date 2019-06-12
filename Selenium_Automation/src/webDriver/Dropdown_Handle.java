package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//dropdown handle
		Select abc = new Select(driver.findElement(By.id("month")));
		abc.selectByVisibleText("Nov");

		
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Dec");
		
		new Select(driver.findElement(By.id("month"))).selectByValue("5");//may
		
		new Select(driver.findElement(By.id("month"))).selectByIndex(4);
		
	}

}
