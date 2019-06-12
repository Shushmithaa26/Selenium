package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VadationCommand {

	
	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");

		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// validate checkbox is checked or not?
		boolean checkbox = driver.findElement(By.xpath("//*[@id='checkbox1']")).isSelected();
		System.out.println(checkbox);
		if (checkbox) {
			System.out.println("The checbox is selected bydefault");

		} else {
			System.out.println("The checbox is NOT selected bydefault");
		}

		// click on checkbox
		driver.findElement(By.xpath("//*[@id='checkbox1']")).click();
		// again valid the checkbox is selected or not?

		boolean checkbox1 = driver.findElement(By.xpath("//*[@id='checkbox1']")).isSelected();
		System.out.println(checkbox1);
		if (checkbox1) {
			System.out.println("*******The checbox is selected bydefault");

		} else {
			System.out.println("*******The checbox is NOT selected bydefault");
		}

		
		//isEnabled():L to validate the element is enabled or disabled?
		driver.navigate().to("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		boolean generateFile = driver.findElement(By.xpath("//*[@id='create']")).isEnabled();
		System.out.println(generateFile);
		if (generateFile) {
			System.out.println("*******The generateFile is enabled state");

		} else {
			System.out.println("*******The generateFile is disable state");
		}
		
		//Enter the text on edit box
		driver.findElement(By.id("textbox")).sendKeys("Testing");
		Thread.sleep(2000);
		boolean generateFile1 = driver.findElement(By.xpath("//*[@id='create']")).isEnabled();
		System.out.println(generateFile1);
		if (generateFile1) {
			System.out.println("@@@@@@@@@The generateFile is enabled state");
			
		} else {
			System.out.println("@@@@@@@The generateFile is disable state");
		}
		
		
		
		driver.quit();
	}

}
