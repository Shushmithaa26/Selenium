package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class FBLoginWithDifferentSetData {

	@Test(dataProvider = "myTest")
	public void f(Integer n, String s) {
		System.out.println(n);
		System.out.println(s);
	}

	@DataProvider
	public Object[][] myTest() {
		
		return new Object[][] { 
			new Object[] { 1, "a" },
			new Object[] { 2, "b" }, 
			new Object[] { 3232, "bsdfgsdfg" }, 
			new Object[] { 325325322, "fdsgsgb" }, 
			
		};
	}
}
