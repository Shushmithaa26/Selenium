package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class LoginwithDataprovideSetofData {
	@Test(dataProvider = "dp")
	public void f(String UN, String PWD) throws Exception {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\ChromeLatest\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(UN);
		driver.findElement(By.name("pass")).sendKeys(PWD);
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginbutton);

		Thread.sleep(3000);	
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "test123@gmail.com", "aasdfsdf34" }, new Object[] { "test3253@gmail.com", "sgdssdf34" }, };
	}
}
