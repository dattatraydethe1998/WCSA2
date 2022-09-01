package testngpack;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

public class Demo {
  @Test
  public void a() 
  {
	  Reporter.log("Hi I am from method a",true);
  }
 

}

