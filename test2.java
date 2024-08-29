package Chapter16;

import org.testng.annotations.*;

public class test2 {
	
	@Test (groups = {"Smoke"})
	public void Demo() {
		System.out.println("this is FIRST test");
	}
	
	@BeforeTest
	public void Example() {
		System.out.println("This SHOULD RUN FIRST!!!");
	}

}
