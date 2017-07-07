package PageObjects;

import org.openqa.selenium.By;

import genericLibraries.BaseClass;

public class HomePage extends BaseClass {
	
	//webElements
	
	public static By clientLogin = By.xpath("//a[contains(@href, 'https://clients.insurancehotline.com/Login.aspx')]");
	public static By aboutus = By.xpath("//a[@href='/aboutus/']");
	public static By contactus = By.xpath("//a[@href='/contactus/']");
	public static By howItWorks = By.xpath("//a[@href='/how-it-works/']");
	public static By media = By.xpath("//a[contains(.,'Media')]");

	
	
	
	//Actions
	public void clickonClientLogin(){
		
		driver.findElement(clientLogin).click();	
		
	}
	
	public void clickonaboutus(){
		
		driver.findElement(aboutus).click();	
		
	}
	
	public void clickoncontactus(){
		
		driver.findElement(contactus).click();	
		
	}
	
	public void clickonhowItWorks(){
		
		driver.findElement(howItWorks).click();	
		
	}
	
	public void clickonmedia(){
		
		driver.findElement(media).click();	
		
	}
	
	
	
	
	
	

}
