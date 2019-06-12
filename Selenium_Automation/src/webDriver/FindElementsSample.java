package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSample {
	//
	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\ChromeLatest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shuhsmitha/Downloads/Selenium%20Files/NSR_Selenium%20Automation.html");

		// get Raido buttons count
		int radioButtonCount = driver.findElements(By.xpath("//*[@type='radio']")).size();
		System.out.println("Radio Button Count is:" + radioButtonCount);

		// get Checkboxes count
		int checkboxesCount = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		System.out.println("checkboxes Count is:" + checkboxesCount);

		// get text boxes count
		int textCount = driver.findElements(By.xpath("//*[@type='text']")).size();
		System.out.println("text Count is:" + textCount);

		// get text boxes count
		int dropdownCount = driver.findElements(By.xpath("//select")).size();
		System.out.println("dropdown Count is:" + dropdownCount);

		// get text boxes count
		int linkCount = driver.findElements(By.xpath("//a")).size();
		System.out.println("Link Count is:" + linkCount);

	}

}
