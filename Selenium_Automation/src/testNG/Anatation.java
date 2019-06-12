package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Anatation {
  @Test
  public void f() {
	  System.out.println("@Test f");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

  @Test
  public void b() {
	  System.out.println("@Test b");
  }
}
