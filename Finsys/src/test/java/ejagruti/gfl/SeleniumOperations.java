package ejagruti.gfl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumOperations {
	
	
	static WebDriver driver;
	
	public static void SetProperty(String value1,String value2)  
	{
		System.setProperty(value1, value2);
		driver=new ChromeDriver();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void lauchUrl(String url) 
	{
		driver.navigate().to(url);
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickButton(String xpath) {
		WebElement login=driver.findElement(By.xpath(xpath));
		login.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setText(String xpath,String value)
	{
		WebElement element=driver.findElement(By.xpath(xpath));
		element.sendKeys(value);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void selectText(String xpath,String value) 
	
	{
		 WebElement element=driver.findElement(By.xpath(xpath));
		 Select sel=new Select(element);
		  sel.selectByValue(value);
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
	}
	
	public static void switchTo(String value) 
	{
		driver.switchTo().frame(value);	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	
	//retrun true if elemet exists otherwise false
	public static boolean checkElementifExist(String xpath) 
	{
	  boolean ifExist =	driver.findElements( By.xpath(xpath) ).size() != 0;
	  return ifExist;
		
	}
	
	public static void close()
	{
		driver.close();
	}
	
	public static String getPopupText()
	{
		 WebDriverWait wait = new WebDriverWait(driver, 2);
	 	 wait.until(ExpectedConditions.alertIsPresent());
	 	 Alert alert = driver.switchTo().alert();
	 	 return (alert.getText());
	}
	
public static String  getText(String xpath)
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement element=driver.findElement(By.xpath(xpath));
	return (element.getText());
	}
	
     public static void clear(String xpath) {
      WebElement element=  driver.findElement(By.xpath(xpath));
      element.clear();
        try {
    		Thread.sleep(2000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
        
     }
	 public static void acceptPopup() {

 	   WebDriverWait wait = new WebDriverWait(driver, 2);
	 	    wait.until(ExpectedConditions.alertIsPresent());
	 	    Alert alert = driver.switchTo().alert();
	 	    System.out.println(alert.getText());
	 	    alert.accept();
	 	   try {
	    		Thread.sleep(2000);
	    	} catch (InterruptedException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	 }
	 	  public static void selectNumber(String xpath,int value) 
	 		
	 		{
	 			 WebElement element=driver.findElement(By.xpath(xpath));
	 			 Select sel=new Select(element);
	 			  sel.selectByIndex(value);
	 			  try {
	 					Thread.sleep(1000);
	 				} catch (InterruptedException e) {
	 					// TODO Auto-generated catch block
	 					e.printStackTrace();
	 				}
	 		}
	 	  
	 		  public static int getNumberOfElements(String xpath)
	 			  {
	 			 try {
	 					Thread.sleep(1000);
	 				} catch (InterruptedException e) {
	 					// TODO Auto-generated catch block
	 					e.printStackTrace();
	 				}
	 				return driver.findElements(By.xpath(xpath)).size();
	 						
	 			  }
	 		  
	 		  
	 		  public static int getNumberOfItems()
	 		  {
	 			 WebElement element=driver.findElement(By.xpath("//div[@class='pagination-info']"));
	 			String result= element.getText(); 
	 			String[] TotalCompanies= result.split(" ");
	 			
	 			int count= Integer.parseInt(TotalCompanies[5]);
	 			
	 			return count;
	 			 
	 			
	 		  }
	 		  
	 		 public static int getpageCount(int countperpage,int Totalcount)
	 		{
	 		 
	 			int total=Totalcount/countperpage;
	 			if (Totalcount%countperpage==0)
	 			{
	 				return total;
	 				
	 			}

	 			else 
	 			{
	 			return total+1;
	 			}
	 			  
	 		  }
	 		  
		
	 		public static int getLastPageItems(int Totalnumber,int countperpage)
			{
				if(Totalnumber%countperpage==0)
				{
			        return countperpage;
				}
				else
				{
					 return Totalnumber%10;
				}
				   
			}
	 		
	 		public static String getClassNameOfParentsParent(String xpath)
	 		{
	 			WebElement childElement= driver.findElement(By.xpath(xpath));
	 			WebElement parentElement = childElement.findElement(By.xpath("./.."));
	 			WebElement parentsParentElement=parentElement.findElement(By.xpath("./.."));
	 		String classOFparentElement=parentsParentElement.getAttribute("class");
	 		return classOFparentElement;
	 		}
		


}


