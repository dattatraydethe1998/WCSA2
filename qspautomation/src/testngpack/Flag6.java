package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6{
  @Test(groups = "FUNCTIONAL")
  public void ft1() 
  {
	  Reporter.log("Functional test  case 1",true);
  }
  @Test(groups = "INTEGRATION")
  public void it1() 
  {
	  Reporter.log("integration test case 1",true);
  }
  @Test(groups = "SMOKE")
  public void st1() 
  {
	  Reporter.log("smoke test case 1",true);
  }
  //----------------
  @Test(groups = "FUNCTIONAL")
  public void ft2() 
  {
	  Reporter.log("Functional test  case 2",true);
  }
  @Test(groups = "INTEGRATION")
  public void it2() 
  {
	  Reporter.log("integration test case 2",true);
  }
  @Test(groups = "SMOKE")
  public void st2() 
  {
	  Reporter.log("smoke test case 2",true);
  }
  //--------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft3() 
  {
	  Reporter.log("Functional test  case 3",true);
  }
  @Test(groups = "INTEGRATION")
  public void it3() 
  {
	  Reporter.log("integration test case 3",true);
  }
  @Test(groups = "SMOKE")
  public void st3() 
  {
	  Reporter.log("smoke test case 3",true);
  }
}
