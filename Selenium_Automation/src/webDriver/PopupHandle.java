package webDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chrome-74\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		// implicit wait:: page loading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Get the window name/id of the page (where the cursor point is pacled)
		String mainwindowName = driver.getWindowHandle();
		System.out.println("mainwindowName is: "+ mainwindowName); //Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com
		
		
		//get the window names of all the windows (Parent/Child)
		Set<String> childWindowNames  = driver.getWindowHandles();//g[0],g[1],g[2],g[3]
		System.out.println(childWindowNames.size());//4
		
		//Close the child windows
		//move cursor point to child window
		for (String i : childWindowNames ) { 
			//{Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com,
			//HCL,
			//Genpact, 
			//Amazon }
			
			System.out.println(driver.switchTo().window(i).getTitle());
			System.out.println("*********************************");
			
			//will close only child windows
			if (!mainwindowName.equals(childWindowNames)) {
				driver.switchTo().window(i).close();
			}
			else {
				System.out.println("Both the window names ar matching....");
			}
		}//for loop end
		
		//move cursor point to parent window(mainwindowName)
		//driver.switchTo().window(mainwindowName);
		Thread.sleep(5000);
		//click on RegisterwithUs button on parent window
		driver.findElement(By.xpath("//*[@value='Register with us']")).click();
		
		//Thread.sleep(6000);
		
		
		//driver.quit();
		
	}

}
