package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class practicefalag1{
  @Test(enabled = true) // true or false
  public void method1() 
  {
	  Reporter.log("actiTime Valid",true);
  }
  @Test
  public void method2() 
  {
	  Reporter.log("ActiTime create user",true);
  }
  @Test
  public void method3() 
  {
	  Reporter.log("ActiTime create reports",true);
  }
}
