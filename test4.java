package Chapter16;

import org.testng.annotations.*;

public class test4 {
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstusrname";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondusrname";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdusrname";
		data[2][1] = "thirdpassword";
		
		return data;
	}
	
  @Parameters({"URL", "APIKey/usrname"})
  @Test
  public void func1(String urlname, String key) {
		System.out.println(urlname + " " + key);
  }
  
   @Test(dataProvider = "getData")
  public void func2(String usrname, String password) {
	  System.out.println(usrname);
	  System.out.println(password);
  }
  
  
  
}
