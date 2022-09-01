package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "This test is used to perfrom a valid login")
  public void validActiTimeTest()
  
  {
	  Reporter.log("valid login is performed",true);
  }
  @Test(description = "This test is used to perfrom a Invalid login")
  public void InvalidActiTimeTest()
  {
	  Reporter.log("valid login is performed",true);
  }
}
