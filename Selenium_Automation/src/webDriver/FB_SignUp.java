package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_SignUp {

	public static void main(String[] args) throws Exception {

		// create web driver reference name
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Enter First Name
		driver.findElement(By.name("firstname")).sendKeys("Test First");

		// Enter Last Name
		driver.findElement(By.name("lastname")).sendKeys("Test Last");
		// validate Re-enterEmail element has displayed?
		if (driver.findElement(By.xpath("//*[@aria-label='Re-enter email']")).isDisplayed()) {
			System.out.println("Re-enter elem,ent is displayed");
		} else {
			System.out.println("Re-enter elem,ent is NOT displayed");
		}

		// Enter Mobile number and Email
		driver.findElement(By.xpath("//*[@aria-label='Mobile number or email']")).sendKeys("testing@gmail.com");
		Thread.sleep(5000);
		// validate Re-enterEmail element has displayed?
		if (driver.findElement(By.xpath("//*[@aria-label='Re-enter email']")).isDisplayed()) {
			System.out.println("Re-enter element is displayed");
		} else {
			System.out.println("Re-enter element is NOT displayed");
		}
		// Re Enter Email
		// driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testing@gmail.com");

		// Enter New Password
		// driver.findElement(By.xpath("//*[@id,'u_0_o']")).sendKeys("Test$1234");

		// Enter Birthday
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Dec");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("1");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2018");

		// validate Radio button Female is selected or not?

		boolean Gender = driver.findElement(By.xpath("(//*[@class='_58mt'])[1]")).isSelected();
		System.out.println(Gender);
		if (Gender) {
			System.out.println("Gender Female is selected by default");

		} else {
			System.out.println("Gender Female is not selected bydefault");
		}

		// click on Radio Button Female
		driver.findElement(By.xpath("(//*[@class='_58mt'])[1]")).click();
		Thread.sleep(5000);

		// again Validate the Radio button is selected or not? (failing again why?
		boolean Gender1 = driver.findElement(By.xpath("(//*[@class='_58mt'])[1]")).isSelected();
		System.out.println(Gender1);
		if (Gender1) {
			System.out.println("*******Gender Female is clicked ");

		} else {
			System.out.println("*******Gender Female is not clicked ");
		}

		// validate Sign up button is displayed or not?
		boolean signup = driver.findElement(By.xpath("//*[@id='u_0_u']")).isEnabled();
		System.out.println(signup);

		if (signup) {
			System.out.println("Sign up button is in Enabled State");
		} else {
			System.out.println("Sign up button is in disabled State");
		}

		// to close the window

		// Click on Sign up

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='u_0_u']")).click();

	}

}
