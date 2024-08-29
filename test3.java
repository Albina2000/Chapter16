package Chapter16;

import org.testng.annotations.*;

public class test3 {
	
	@Parameters({"URL"})
	@Test
	public void WebTestAuto(String urlname) {
		System.out.println("Web test automation");
		System.out.println(urlname);
	}
	
	@Test
	public void MobileTestAuto() {
		System.out.println("Mobile test automation");
	}
	
	@Test
	public void MobileSignInAuto() {
		System.out.println("Mobile test signin");
	}
	
	@Test(dependsOnMethods = {"WebTestAuto"})
	public void MobileSignOutAuto() {
		System.out.println("Mobile test signout");
	}
	
	@Test
	public void MobileLoginAuto() {
		System.out.println("Mobile test login");
	}
	
	@Test
	public void RestAPIAuto() {
		System.out.println("Rest API automation");
	}
	
	@BeforeSuite
	public void befSuite() {
		System.out.println("VERY VERY FIRST!!!");
	}
	
	@BeforeMethod
	public void befevery() {
		System.out.println("I am repeating BEFORE every method in test3");
	}
	
	@AfterMethod
	public void afterevery() {
		System.out.println("I am repeating AFTER every method in test3");
	}
	
	@BeforeClass
	public void befclass() {
		System.out.println("I am executing BEFORE CLASS");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am executing AFTER CLASS");
	}

}
