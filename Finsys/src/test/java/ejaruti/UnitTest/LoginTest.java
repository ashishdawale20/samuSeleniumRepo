package ejaruti.UnitTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import ejagruti.gfl.SeleniumOperations;

public class LoginTest {
	
	
	@BeforeSuite()
	public void beforeSuite()
	{
		System.out.println("called before suite");
	}
	
	
	@AfterSuite()
	public void afterSuite()
	{
		System.out.println("called after suite");
	}
	
	
	
	
	
	@BeforeMethod
	public void beforeMethod() 
	{
		SeleniumOperations.SetProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVERS\\chromedriver.exe");
		SeleniumOperations.lauchUrl("http://localhost:90/finsys/login.html");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		SeleniumOperations.close();
	}
	
	@Test
public void validLoginTest() {

	//act	
	//SeleniumOperations.SetProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVERS\\chromedriver.exe");
	//SeleniumOperations.lauchUrl("http://localhost:90/finsys/login.html");
	SeleniumOperations.setText("//input[@placeholder='Username']", "dummyfm");
	SeleniumOperations.setText("//input[@placeholder='Password']", "passw0rd");
	SeleniumOperations.clickButton("//a[@onclick='return ValidateLogin()']");
	
	 boolean actual=SeleniumOperations.checkElementifExist("//div[@id='result']/h1");
	   boolean expected=false; // not exits
	   
	   assertEquals(actual, expected);
	              
	
	}
	

	@Test
public void invalidLoginTest() {

	//act	
	
	SeleniumOperations.setText("//input[@placeholder='Username']", "dummyf");
	SeleniumOperations.setText("//input[@placeholder='Password']", "passw0");
	SeleniumOperations.clickButton("//a[@onclick='return ValidateLogin()']");
	boolean actual =SeleniumOperations.checkElementifExist("//div[@id='error']");
	boolean expected= true;
	//assert
	assertEquals(actual,expected );                
	
	}

	@Test
	public void invalidusernameTest() {

		//act	
		
		SeleniumOperations.setText("//input[@placeholder='Username']", "hkjhdkj");
		SeleniumOperations.setText("//input[@placeholder='Password']","passw0rd");
		SeleniumOperations.clickButton("//a[@onclick='return ValidateLogin()']");
		boolean actual =SeleniumOperations.checkElementifExist("//div[@id='error']");
		boolean expected= true;
		//assert
		assertEquals(actual,expected );   
		}
	@Test
	public void invalidpasswordTest() {

		//act	
	
		SeleniumOperations.setText("//input[@placeholder='Username']", "dummyfm");
		SeleniumOperations.setText("//input[@placeholder='Password']", "hgfjgjm");
		SeleniumOperations.clickButton("//a[@onclick='return ValidateLogin()']");
		boolean actual =SeleniumOperations.checkElementifExist("//div[@id='error']");
		boolean expected= true;
		//assert
		assertEquals(actual,expected );             
		
		}
	
}
