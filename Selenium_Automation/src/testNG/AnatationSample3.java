package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnatationSample3 {
	@Test
	public void scenario1() {
		System.out.println(" scenario1 ");
	}

	@Test
	public void scenario2() {
		System.out.println(" scenario2 ");
	}

	@Test
	public void scenario3() {
		System.out.println(" scenario3 ");
	}

	@BeforeMethod
	public void login() {
		System.out.println("  @BeforeMethod");

	}

	@AfterMethod
	public void logout() {
		System.out.println("  @AfterMethod");

	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println(" @BeforeSuite");

	}
}
