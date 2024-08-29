package Chapter16;

import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is maven and testng project");
  }
  
  @Test
  public void f2() {
	  System.out.println("this is second");
  }
  
  @AfterTest
  public void f3() {
	  System.out.println("This SHOULD RUN LAST!!!");
  }
  
  @AfterSuite
  public void f4() {
	  //System.out.println("VERY VERY LAST!!!");
	  Assert.assertTrue(false);
	  System.out.println("VERY VERY LAST!!!");
  }
  
}
