package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeekLive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.collegeweeklive.com/go-signup/");
		// java wait statement
		// Thread.sleep(5000);//eclipse will wait 5 seconds

		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("firstName")).sendKeys("SHUSHMITHA");
		// driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("SHUSHMITHA");
		driver.findElement(By.id("lastName")).sendKeys("ATTIPALLI");
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//*[@id='phoneNumber']")).sendKeys("5022297336");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys("testing");
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("UNITED STATES");
		driver.findElement(By.id("submit")).click();

	}

}
