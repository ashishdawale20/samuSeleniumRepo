package ejaruti.UnitTest;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ejagruti.gfl.SeleniumOperations;

public class EditeCompany {
	
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
	
	@Test
	public void editeCompanyName()
	{
		Random rand = new Random(); 
	    int rand_int = rand.nextInt(1000);
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//div[@style='text-align:center;height:16px;']");
	    SeleniumOperations.clear("//input[@name='name']");
	    SeleniumOperations.setText("//input[@name='name']", "Samiksha"+rand_int);
	    SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    String expected="Samiksha"+rand_int;
		   String actual= SeleniumOperations.getText("//*[@id=\"datagrid-row-r1-2-0\"]/td[1]/div");
		   assertEquals(actual, expected);
} 
	
	
	@Test
	public void editEmailNumber()
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//div[@style='text-align:center;height:16px;']");
	    SeleniumOperations.clear("//input[@name='email']");
	    SeleniumOperations.setText("//input[@name='email']","samu@gmail.com");
	    SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    String expected="samu@gmail.com";
		   String actual= SeleniumOperations.getText("//*[@id=\"datagrid-row-r1-2-0\"]/td[7]/div");
		   assertEquals(actual, expected);
	
	}
	
	
	@Test
	public void editPanNumber()
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
	    SeleniumOperations.clickButton("//div[@style='text-align:center;height:16px;']");
	    SeleniumOperations.clear("//input[@name='pan']");
	    SeleniumOperations.setText("//input[@name='pan']","ABCD123456");
	    SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    String expected="ABCD123456";
		   String actual= SeleniumOperations.getText("//*[@id=\"datagrid-row-r1-2-0\"]/td[8]/div");
		   assertEquals(actual, expected);
	}  
	
	
	}