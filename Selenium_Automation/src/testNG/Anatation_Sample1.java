package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Anatation_Sample1 {
  @Test
  public void f() {
	  System.out.println("@Test ");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite ");
  }

}
