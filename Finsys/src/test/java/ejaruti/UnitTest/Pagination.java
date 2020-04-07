package ejaruti.UnitTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ejagruti.gfl.SeleniumOperations;

public class Pagination {
	
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
	public static void  pagination10CompaniesPerPageTest()
	
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
		SeleniumOperations.selectNumber("//select[@class='pagination-page-list']",0);
		
		 
	   int expected= 10;
	  int actual=SeleniumOperations.getNumberOfElements("//span[@class='datagrid-row-expander datagrid-row-expand']");
	    assertEquals(actual, expected);
	}

	@Test
	public static void  pagination20CompaniesPerPageTest()
	
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
		SeleniumOperations.selectNumber("//select[@class='pagination-page-list']",1);
		 int expected= 20;
		  int actual=SeleniumOperations.getNumberOfElements("//span[@class='datagrid-row-expander datagrid-row-expand']");
		    assertEquals(actual, expected);
	}
	
	@Test
	public static void  pagination30CompaniesPerPageTest()
	
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
		SeleniumOperations.selectNumber("//select[@class='pagination-page-list']",2);
		 int expected= 30;
		  int actual=SeleniumOperations.getNumberOfElements("//span[@class='datagrid-row-expander datagrid-row-expand']");
		    assertEquals(actual, expected);
	}
	@Test
	public static void pagination40CompaniesPerPageTest()
	
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
		SeleniumOperations.selectNumber("//select[@class='pagination-page-list']",3);
		 int expected= 40;
		  int actual=SeleniumOperations.getNumberOfElements("//span[@class='datagrid-row-expander datagrid-row-expand']");
		    assertEquals(actual, expected);
	}
	@Test
	public static void pagination50CompaniesPerPageTest()
	
	{
		SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
		SeleniumOperations.selectNumber("//select[@class='pagination-page-list']",4);
		 int expected= 50;
		  int actual=SeleniumOperations.getNumberOfElements("//span[@class='datagrid-row-expander datagrid-row-expand']");
		    assertEquals(actual, expected);
	}
	
		@Test 
	public static void paginationFirstButtonDesabledTest()
	{   SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
		String classOfparentElement=SeleniumOperations.getClassNameOfParentsParent("//span[@class='l-btn-icon pagination-first']");
		boolean expected=true;
		boolean actual=classOfparentElement.contains("disabled");
		 assertEquals(actual, expected);
		
	}
	
		@Test 
		public static void paginationPreviousButtonDesabledTest()
		{
			SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
			SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
			SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
			SeleniumOperations.switchTo("actionid");
			String classOfparentElement=SeleniumOperations.getClassNameOfParentsParent("//span[@class='l-btn-icon pagination-prev']");
			boolean expected=true;
			boolean actual=classOfparentElement.contains("disabled");
			 assertEquals(actual, expected);
			}
		
		@Test 
		public static void paginationLastButtonEnabledTest()
		{

			SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
			SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
			SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
			SeleniumOperations.switchTo("actionid");
			String classOfparentElement=SeleniumOperations.getClassNameOfParentsParent("//span[@class='l-btn-icon pagination-last']");
			
			boolean expected=false;
			boolean actual=classOfparentElement.contains("disabled");
			 assertEquals(actual, expected);
		}
		
		@Test 
		public static void paginationNextButtonEnabledTest()
		{
			SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
			SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
			SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
			SeleniumOperations.switchTo("actionid");
			String classOfparentElement=SeleniumOperations.getClassNameOfParentsParent("//span[@class='l-btn-icon pagination-next']");
			boolean expected=false;
			boolean actual=classOfparentElement.contains("disabled");
			 assertEquals(actual, expected);
		}
		
		@Test
		public static void pagiantionFristButtonClickTest()
		{
			SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
			SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
			SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
			SeleniumOperations.switchTo("actionid");
			SeleniumOperations.clickButton("//span[@class='l-btn-icon pagination-next']");
			SeleniumOperations.clickButton("//span[@class='l-btn-icon pagination-first']");
			int totalCount = SeleniumOperations.getNumberOfItems();
			
			
			String expected="Displaying 1 to 10 of "+totalCount+" items";
			String actual = SeleniumOperations.getText("//div[@class='pagination-info']");
			
			assertEquals(actual, expected);
			
		}
		
		@Test
		public static void pagiantionPreviousButtonClickTest()
		{
			
			SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
			SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
			SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
			SeleniumOperations.switchTo("actionid");
			SeleniumOperations.clickButton("//span[@class='l-btn-icon pagination-next']");
			SeleniumOperations.clickButton("//span[@class='l-btn-icon pagination-prev']");
            int totalCount = SeleniumOperations.getNumberOfItems();
			
			
			String expected="Displaying 1 to 10 of "+totalCount+" items";
			String actual = SeleniumOperations.getText("//div[@class='pagination-info']");
			
			assertEquals(actual, expected);
			}
		
		
		@Test
		public static void pagiantionLastButtonClickTest()
		{
			SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
			SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
			SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
			SeleniumOperations.switchTo("actionid");
			SeleniumOperations.clickButton("//span[@class='l-btn-icon pagination-last']");
			int totalCount = SeleniumOperations.getNumberOfItems();
			int PageNumber= totalCount/10;
			int lastcount=PageNumber*10;
			int lastPageCount=lastcount+1;
			  
			int expected=61;
			int actual=lastcount+1;
			assertEquals(actual, expected);
		}
		
		@Test
		public static void pagiantionNextButtonClickTest()
		{
			SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
			SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
			SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
			SeleniumOperations.switchTo("actionid");
			SeleniumOperations.clickButton("//span[@class='l-btn-icon pagination-next']");
           int totalCount = SeleniumOperations.getNumberOfItems();
			
			
			String expected="Displaying 11 to 20 of "+totalCount+" items";
			String actual = SeleniumOperations.getText("//div[@class='pagination-info']");
			
			assertEquals(actual, expected);
		
		
		}
		
		
		
		@Test
		public static void pagiantionEnterFirstPageNumberTest()
		{
			SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
			SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
			SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
			SeleniumOperations.switchTo("actionid");
			SeleniumOperations.clear("//input[@class='pagination-num']");
			SeleniumOperations.setText("//input[@class='pagination-num']","1");
			int count = 0;
			 int totalCount = SeleniumOperations.getNumberOfItems();

			 if(totalCount>10)
				{
				 count=10;
				
				}
				else
				{
					count = totalCount;
				}
	//1	
			String expected="Displaying 1 to "+count+" of "+totalCount+" items";
			String actual = SeleniumOperations.getText("//div[@class='pagination-info']");
			assertEquals(actual, expected);
			
			
			  
	//	2	
			int expected1=count;
			int actual1=SeleniumOperations.getNumberOfElements("//span[@class='datagrid-row-expander datagrid-row-expand']");
           assertEquals(actual1, expected1);  
		
           
		
		}

	

/*		@Test
		public static void pagiantionEnterLastPageNumberTest()
		{SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
		SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
		SeleniumOperations.switchTo("actionid");
		SeleniumOperations.clear("input[@class='pagination-num']");
		SeleniumOperations.setText("input[@class='pagination-num']","7");
	
		
			
		}
	*/
	
	
	
}
