package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chrome-74\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.com/");
		// java wait statement
		// Thread.sleep(5000);//eclipse will wait 5 seconds

		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[text()='LOGIN'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(5000);
		//Alert will display
		//get the text from alert
		String alertText  = driver.switchTo().alert().getText();
		System.out.println("alertText is "+ alertText);
		//click on OK button in ALERT
		driver.switchTo().alert().accept();
		
		//Click on New User link
		driver.findElement(By.partialLinkText("New User")).click();
		Thread.sleep(5000);
		//get ther confirmation alert text
		String confirmationalertText  = driver.switchTo().alert().getText();
		System.out.println("confirmation alertText is : "+ confirmationalertText);
		//to click on Cancel button on confirmation alert will use DISMISS() method
		driver.switchTo().alert().dismiss();	
		
		
		Thread.sleep(5000);
		driver.quit();
		
			
	}

}
