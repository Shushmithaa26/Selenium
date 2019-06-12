package webDriver;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetTheScreenshot {

	public static void main(String[] args) throws Exception {

		// create webdriver reference name
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\ChromeLatest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testing@gmail.com");
		// type password
		driver.findElement(By.name("pass")).sendKeys("testing123");

		// Login button click
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		
		

		// get the System Date and time
		Date d = new Date();
		System.out.println(d);// Mon Jun 03 18:46:48 PDT 2019
		// customization date "DDMMYYYY_HHMMSS"
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");// 03jun2019_184648
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		// How to take screeshot
		String pathoftheScreenshot = ".\\Screenshots\\";
		// FileInputStream fi = new FileInputStream(fi);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// file will store into RAM location
		FileHandler.copy(srcFile, new File(pathoftheScreenshot + "FB"+timeStamp+".PNG"));

	}

}
