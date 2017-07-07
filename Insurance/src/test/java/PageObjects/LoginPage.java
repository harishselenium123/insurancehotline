package PageObjects;

import org.openqa.selenium.By;

import genericLibraries.BaseClass;

public class LoginPage extends BaseClass{
	
	
	public static By username = By.xpath("//input[contains(@id,'UserName')]");
	public static By password = By.xpath("//input[contains(@id,'Password')]");
	public static By forgotpass = By.xpath("//a[contains(.,'Forget your password?')]");
	public static By loginButton = By.xpath("//input[@value='Log In']");
	public static By remember = By.xpath("//input[@type='checkbox']");
	public static By newRegistration = By.xpath("//a[contains(.,'Click Here.')]");



	public void fillDataToLogin(){
		
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("hareesh");
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("hareesh");
		
		
	}
	public void clickOnLogin(){
		
		driver.findElement(loginButton).click();
	}
	
	public void clickOnnewRegistration(){
		
		driver.findElement(newRegistration).click();
	}
	
	public void clickOnrememberCheckBox(){
		
		driver.findElement(remember).click();
	}
	
	
	
	
	
	
	
	

}
