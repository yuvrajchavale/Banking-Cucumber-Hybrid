package commonFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankFunctionLibrary {
	public static WebDriver driver;
	
	//method for launch url
	public static void openUrl(String url )
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public static void waitForElement(String LType,String Lvalue,String TestData) 
	{
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(TestData)));
	
		if (LType.equalsIgnoreCase("xpath")) 
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Lvalue)));
		}
		
		if (LType.equalsIgnoreCase("name")) 
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Lvalue)));
		}	
		
	}
	
	public static void typeAction(String LType,String Lvalue, String TestData) {
		if (LType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Lvalue)).clear();
			driver.findElement(By.name(Lvalue)).sendKeys(TestData);
		}
		
		if(LType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(Lvalue)).click();
			driver.findElement(By.xpath(Lvalue)).sendKeys(TestData);
		}
	}
	
	public static void clickAction(String Ltype,String Lvalue) 
	{
		if(Ltype.equalsIgnoreCase("name")) 
		{
			driver.findElement(By.name(Lvalue)).click();
		}
		
		if(Ltype.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(Lvalue)).click();
		}
	}
	
	public static void closeBrowser() 
	{
		driver.quit();
	}

}
