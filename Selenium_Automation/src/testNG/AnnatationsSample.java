package testNG;

import org.testng.annotations.Test;

public class AnnatationsSample {
  @Test
  public void f() {
	  System.out.println("@test f");
  }
  @Test
  public void test() {
	  System.out.println("@test test");
  }
  @Test
  public void next() {
	  System.out.println("@test next");
  }
  @Test
  public void rest() {
	  System.out.println("@test rest");
  }
}
