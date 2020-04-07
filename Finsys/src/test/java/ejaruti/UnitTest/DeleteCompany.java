package ejaruti.UnitTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ejagruti.gfl.SeleniumOperations;

public class DeleteCompany {
	
	
	
	

	@BeforeMethod
	public void beforMethod()
	{
		
	SeleniumOperations.SetProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVERS\\chromedriver.exe");
	SeleniumOperations.lauchUrl("http://localhost:90/finsys/login.html");
	SeleniumOperations.setText("//input[@placeholder='Username']", "dummyfm");
	SeleniumOperations.setText("//input[@placeholder='Password']", "passw0rd");
	SeleniumOperations.clickButton("//a[@onclick='return ValidateLogin()']");
		
	}

	@AfterMethod
	public void afterMethod()
	{
		SeleniumOperations.close();
		 
	}
	
	
/*	@Test
	public void CancleDeleteCompany()
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//tr[@id='datagrid-row-r1-2-0']");
	   SeleniumOperations.clickButton("//a[@onclick='destroyItem()']");
	   SeleniumOperations.clickButton("//div[@class='messager-button']/a[2]");
	   boolean actual=SeleniumOperations.checkElementifExist("//div[@id='result']/h1");
	   boolean expected=false; // not exits
	   
	   assertEquals(actual, expected);
	   
	}  */
	
	@Test
	public void DeteleCompany()
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//tr[@id='datagrid-row-r1-2-0']");
	   SeleniumOperations.clickButton("//a[@onclick='destroyItem()']");
	   SeleniumOperations.clickButton("//div[@class='messager-button']/a[1]");
	   boolean actual=SeleniumOperations.checkElementifExist("//div[@id='result']/h1");
	   
	   boolean expected=true; // result message exits
	   assertEquals(actual, expected);
	}
	
	

}
