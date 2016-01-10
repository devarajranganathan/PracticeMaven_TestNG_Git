package TestNG;

import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestNG_AllAnnotations {
  @Test(groups={"truck"},dependsOnMethods={"Ferrari"})
  public void Volvo() {
	  System.out.println("Volvo - From Jenkins with chrome");
	  
		System.setProperty("webdriver.chrome.driver", "C://Devaraj//Installers//Selenium//Non-Mozilla Server Driver//Chrome//2.19//chromedriver.exe");
        //WebDriver driver=new ChromeDriver(caps);
        WebDriver driver=new ChromeDriver();
		//driver.get("http://seleniumeasy.com");

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Maximize the window
        
        driver.manage().window().maximize();
 
        //Launch the ToolsQA Website
 
        driver.get("https://www.google.com");
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
	  System.out.println("To Execute Before class");	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("To Execute After class");	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("To Execute Before Test");	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("To Execute After test");	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("To Execute before suite");	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("To Execute after suite");
  }

}
