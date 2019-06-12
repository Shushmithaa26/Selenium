package testNG;

import org.testng.annotations.Test;

public class Priority_TestNG {

	@Test(priority = 4)
	public void f() {
		System.out.println("@test f");
	}

	@Test(priority = 1)
	public void test() {
		System.out.println("@test test");
	}

	@Test(priority = 3)
	public void next() {
		System.out.println("@test next");
	}

	@Test(priority = 2)
	public void rest() {
		System.out.println("@test rest");
	}
	

	@Test
	public void best() {
		System.out.println("@test best");
	}
	@Test
	public void zest() {
		System.out.println("@test zest");
	}
	
}
