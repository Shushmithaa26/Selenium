package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chrome-74\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//String abce = "dsagfsdg sdgs sgsd ";
		
		//Array: limited
		//String abcd[] = {"sdfsd,dsfsd,fgsd,gsdfg,sdg,sg,sg"};
		
		//list: unlimited storage
		List<WebElement>   abc = driver.findElements(By.tagName("a"));
		
		//get the number of list
		System.out.println(abc.size());
		
		for (int i=0; i<abc.size(); i++) {
			System.out.println(abc.get(i).getText());
			
		}
	}

}
