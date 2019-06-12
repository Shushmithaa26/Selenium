package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class FB_CrossBrowserTesting {
	WebDriver driver;

	@Test
	public void fblogin() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testing@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("testing123");
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginbutton);
		Thread.sleep(6000);
		// validate CREATE ACCOUT button is displayed or not?
		boolean createAccount = driver.findElement(By.xpath("//*[text()='Create New Account']")).isDisplayed();
		boolean signUp = driver.findElement(By.xpath("//*[text()='Sign Up']")).isDisplayed();

		if (createAccount) {
			System.out.println("Given credentials are invalid");
		} else if (signUp) {
			System.out.println("Given credentials are invalid");
		} else {
			System.out.println("Given credentials are valid");
		}

	}

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chrome-74\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ".\\browserDrivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Please enter valid browser name******************");
		}

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
