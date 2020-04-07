package ejagruti.gfl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateCompany {
	
	
	
	
	 public static void main(String[] args) throws InterruptedException {
		 /*
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVERS\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://localhost:90/finsys/login.html");
	driver.manage().window().maximize();
	*/

	SeleniumOperations.SetProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVERS\\chromedriver.exe");
	
	
	SeleniumOperations.lauchUrl("http://localhost:90/finsys/login.html");
	
		//Thread.sleep(1000);
		SeleniumOperations.setText("//input[@placeholder='Username']", "dummyfm");
	//WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	//username.sendKeys("dummyfm");
	
		//Thread.sleep(1000);
		SeleniumOperations.setText("//input[@placeholder='Password']", "passw0rd");
	//WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	//password.sendKeys("passw0rd");
	
		Thread.sleep(1000);
	
	 SeleniumOperations.clickButton("//a[@onclick='return ValidateLogin()']");
			 
	// WebElement login=driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
	 //login.click();
	 
	//Thread.sleep(1000);
	SeleniumOperations.clickButton("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]");
	//WebElement FinancialAnalysis=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div[1]/div[1]/div[2]/a[2]"));              //("//div[@class='panel-title']"));
	 //FinancialAnalysis.click();
	 
		Thread.sleep(1000);
		
		SeleniumOperations.clickButton("//span[@class='tree-hit tree-expanded']");
	// WebElement company= driver.findElement(By.xpath("//span[@class='tree-hit tree-expanded']"));
	 //company.click();
	 
	// Thread.sleep(1000);
	 SeleniumOperations.clickButton("//*[@id=\"_easyui_tree_2\"]/span[4]/a");
	//WebElement ManageCompany=driver.findElement(By.xpath("//*[@id=\"_easyui_tree_2\"]/span[4]/a"));    //("//a[@onclick='Navigate('Manage Company')']")) ;
	//ManageCompany.click();  
	 //Thread.sleep(1000);	 
	
	 SeleniumOperations.switchTo("actionid");
	//driver.switchTo().frame("actionid");
	 //Thread.sleep(1000);
	 
	 SeleniumOperations.clickButton("//span[@class='l-btn-icon icon-add']");
	// WebElement newButton=driver.findElement(By.xpath("//span[@class='l-btn-icon icon-add']"));
	 //newButton.click();
	 //Thread.sleep(1000);
	 

	 SeleniumOperations.setText("//input[@name='name']", "avapya");
	 //WebElement companyName=driver.findElement(By.xpath("//input[@name='name']"));
	 //companyName.sendKeys("avapya");
	 
	 //Thread.sleep(1000);
	 SeleniumOperations.setText("//select[@id='companytype']","IT");
	  //WebElement companyType=driver.findElement(By.xpath("//select[@id='companytype']"));
	  //companyType.sendKeys("IT");
	  
	  //Thread.sleep(1000); 
	 SeleniumOperations.setText("//select[@name='subtype']","Support");
	  //WebElement companySubtype=driver.findElement(By.xpath("//select[@name='subtype']"));
	  //companySubtype.sendKeys("Support");
	  
	 // Thread.sleep(1000);
	 SeleniumOperations.setText("//textarea[@class='textbox-text validatebox-text textbox-prompt']","jagtap dairy");
	  //WebElement address=driver.findElement(By.xpath("//textarea[@class='textbox-text validatebox-text textbox-prompt']"));
	  //address.sendKeys("jagtap dairy");
	  //Thread.sleep(1000);
	 
	 SeleniumOperations.setText("//input[@type='text']", "1234567890");
	  //WebElement phone=driver.findElement(By.xpath("//input[@type='text']"));
	  //phone.sendKeys("1234567890");
	  
	 // Thread.sleep(1000);
	 
	 SeleniumOperations.setText("//input[@name='email']", "avapya@gmail.com");
	  //WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
	  //Email.sendKeys("avapya@gmail.com");
	  
	  //Thread.sleep(1000);
	 
	 SeleniumOperations.setText("//input[@name='pan']", "ASFC123456");
	 // WebElement pan=driver.findElement(By.xpath("//input[@name='pan']"));
	  //pan.sendKeys("ASFC123456");
	  
	  //Thread.sleep(1000);
	 
	 SeleniumOperations.setText("//input[@name='tin']","0987654321");
	 // WebElement tin=driver.findElement(By.xpath("//input[@name='tin']"));
	  //tin.sendKeys("0987654321");
	  
	  //Thread.sleep(1000);
	 
	 SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']", "7214356758");
	  //WebElement mobile=driver.findElement(By.xpath("//input[@class='textbox-text validatebox-text textbox-prompt']"));
	  //mobile.sendKeys("7214356758");
	  
	 // Thread.sleep(1000);
	 
	 SeleniumOperations.setText("//input[@name='website']", "Avapya.com");
	  //WebElement website=driver.findElement(By.xpath("//input[@name='website']"));
	  //website.sendKeys("Avapya.com");
	  
	  //Thread.sleep(1000);
	 
	SeleniumOperations.selectText("//select[@name='countryname']", "IN");
	 /* WebElement country=driver.findElement(By.xpath("//select[@name='countryname']"));
	  Select sel=new Select(country);
	  sel.selectByValue("IN"); 
	  Thread.sleep(1000); */
	
	SeleniumOperations.selectText("//select[@name='state']", "MAHARASHTRA");
	/*  WebElement state=driver.findElement(By.xpath("//select[@name='state']"));
	  Select sel1=new Select(state);
	  sel1.selectByValue("MAHARASHTRA"); */
	
	
	SeleniumOperations.selectText("//select[@name='city']", "PUNE");
	  /*Thread.sleep(1000);
	  WebElement city=driver.findElement(By.xpath("//select[@name='city']"));
	  Select sel2=new Select(city);
	  sel2.selectByValue("PUNE"); */
	
	  SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']","1000");
	 // WebElement employees=driver.findElement(By.xpath("//input[@class='textbox-text validatebox-text textbox-prompt']"));
	  //employees.sendKeys("1000");
	  
	  
	  SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	 // WebElement save=driver.findElement(By.xpath("//a[@onclick='save1(this)']"));
	  //save.click();
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	}

}
