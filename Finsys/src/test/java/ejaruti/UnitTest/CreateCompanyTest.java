package ejaruti.UnitTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ejagruti.gfl.SeleniumOperations;

public class CreateCompanyTest {

	
	
	
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
	public void createCompanyWithoutAnyInputParameterTest()
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//span[@class='l-btn-icon icon-add']");
	    SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    
	    String expected= "Please Select Company Type!!!";
	    String actual=SeleniumOperations.getPopupText();
	    assertEquals(actual, expected);
	    SeleniumOperations.acceptPopup();
	    		
	}  
*/
	@Test(invocationCount = 20)
	public void createCompanyWithInputParameterTest()
	{   Random rand = new Random(); 
	    int rand_int = rand.nextInt(1000); 
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//span[@class='l-btn-icon icon-add']");
	    SeleniumOperations.setText("//input[@name='name']", "avapya"+rand_int);
	    SeleniumOperations.setText("//select[@id='companytype']","IT");
	    SeleniumOperations.setText("//select[@name='subtype']","Support");
	    SeleniumOperations.setText("//textarea[@class='textbox-text validatebox-text textbox-prompt']","jagtap dairy");
	    SeleniumOperations.setText("//input[@type='text']", "1234569890");
	    SeleniumOperations.setText("//input[@name='email']", "avapya1@gmail.com");
	    SeleniumOperations.setText("//input[@name='pan']", "ASFC123756");
	    SeleniumOperations.setText("//input[@name='tin']","0987658321");
	    SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']", "7219356758");
	    SeleniumOperations.setText("//input[@name='website']", "Avapya1.com");
	    SeleniumOperations.selectText("//select[@name='countryname']", "IN");
	    SeleniumOperations.selectText("//select[@name='state']", "MAHARASHTRA");
	    SeleniumOperations.selectText("//select[@name='city']", "PUNE");
	    SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']","1800");
	    SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    
	    String expected="avapya"+rand_int;
	   String actual= SeleniumOperations.getText("//*[@id=\"datagrid-row-r1-2-0\"]/td[1]/div");
	   assertEquals(actual, expected);
	   
	   
	   
	} 
	
	
	
	/*
	@Test
	public void createCompanyWithNoCountryinputParameter()
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//span[@class='l-btn-icon icon-add']");
	    SeleniumOperations.setText("//select[@id='companytype']","IT");
	    SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    
	    String expected= "Please Select Country!!!";
	    String actual=SeleniumOperations.getPopupText();
	    assertEquals(actual, expected);
	    SeleniumOperations.acceptPopup();
	    
	}
	    
	
	
	@Test
	public void createCompanyWithNoStateInputParameterTest()
	{

		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//span[@class='l-btn-icon icon-add']");
	    SeleniumOperations.setText("//select[@id='companytype']","IT");
	    SeleniumOperations.selectText("//select[@name='countryname']", "IN");
	    SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	   
	    String expected= "Please Select State!!!";
	    String actual=SeleniumOperations.getPopupText();
	    assertEquals(actual, expected);
	    SeleniumOperations.acceptPopup();
	}
	
	@Test
	public void createCompanyWithNoCityAsInputParameterTest()
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//span[@class='l-btn-icon icon-add']");
	    SeleniumOperations.setText("//select[@id='companytype']","IT");
	    SeleniumOperations.selectText("//select[@name='countryname']", "IN");
	    SeleniumOperations.selectText("//select[@name='state']", "MAHARASHTRA");
	    SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    
	    String expected= "Please Select City!!!";
	    String actual=SeleniumOperations.getPopupText();
	    assertEquals(actual, expected);
	    SeleniumOperations.acceptPopup();
	  
	}
	*/
	
	}
	