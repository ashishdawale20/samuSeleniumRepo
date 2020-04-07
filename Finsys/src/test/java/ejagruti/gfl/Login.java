package ejagruti.gfl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVERS\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://localhost/finsys/login.html");
        driver.manage().window().maximize();
		
        WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("dummyfm");
        
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("passw0rd");
        
        WebElement login=driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
        login.click();
        
        
        
        
	}

}
