package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.Reporter;
import org.testng.asserts.*;

public class TestNG_AllAnnotations {
  @Test(groups={"truck"},dependsOnMethods={"Ferrari"})
  public void Volvo() {
	  System.out.println("Volvo");
	  Reporter.log("Volvo");
  }
  
  @Test(groups={"car"})
  public void Maruthi() {
	  System.out.println("Maruthi");
	  Reporter.log("Maruthi");	  
  }
  
  @Test(groups={"truck"},dependsOnMethods={"Volvo"})
  public void Iveco() {
	  System.out.println("Iveco");
	  Reporter.log("Iveco");
  }  
  
  @Test(groups={"bus"},dependsOnMethods={"Iveco"})
  public void Bus() {
	  System.out.println("Bus");
	  Reporter.log("Bus");
	
  }
  
  @Test(dependsOnMethods={"Maruthi"},groups={"car"})
  public void Ferrari() {
	  System.out.println("Ferrari");
	  Reporter.log("Ferrari");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test");	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
