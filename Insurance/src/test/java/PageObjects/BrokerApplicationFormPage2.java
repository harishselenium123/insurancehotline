package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;

import genericLibraries.BaseClass;
import genericLibraries.CommonMethod;

public class BrokerApplicationFormPage2 extends BaseClass {
	
	
	public static By companyName = By.id("txtCompanyName");
	public static By ContactName = By.name("txtContactName");
	public static By Telephone  = By.id("txtTelephoneNumber");
	public static By EmailAddress  = By.cssSelector("input#txtEmailAddress");
	public static By WebsiteAddress = By.xpath("//input[@id='txtWebsite']");
	public static By LinesofBusiness= By.name("cblLinesOfBusiness$0");
	public static By InsuranceCompanies= By.id("txtInsuranceCompanies");
	public static By Regions= By.id("txtRegionsCities");
	public static By Comments= By.id("txtComments");
	public static By apply= By.id("btnApply");
	public static By cancel= By.id("btnCancel");
	public static By terms = By.xpath("//a[@href='/terms']");

	 
	/*
	 * Broker/Agent Application Form for InsuranceHotline.com
	 */
	
	public void fillBrokerAgentApplicationForm() throws IOException{
		
		CommonMethod.clear(companyName, "Clearing company field");
		CommonMethod.sendKeys(companyName, "GSS", "Passing data to Company filed");

		

		CommonMethod.clear(ContactName, "Clearing company field");
		CommonMethod.sendKeys(ContactName, "GSS", "Passing data to ContactName filed");
		

		CommonMethod.clear(Telephone, "Clearing company field");
		CommonMethod.sendKeys(Telephone, "+918098756789", "Passing data to Telephone filed");
		

		CommonMethod.clear(EmailAddress, "Clearing company field");
		CommonMethod.sendKeys(EmailAddress, "GSS", "Passing data to EmailAddress filed");
		

		CommonMethod.clear(WebsiteAddress, "Clearing company field");
		CommonMethod.sendKeys(WebsiteAddress, "GSS", "Passing data to WebsiteAddress filed");
		
		CommonMethod.click(LinesofBusiness, "Clicking LinesofBusiness element");
		

		CommonMethod.clear(InsuranceCompanies, "Clearing company field");
		CommonMethod.sendKeys(InsuranceCompanies, "GSS", "Passing data to InsuranceCompanies filed");
		
		CommonMethod.clear(Regions, "Clearing company field");
		CommonMethod.sendKeys(Regions, "GSS", "Passing data to Regions filed");
		
		
		CommonMethod.clear(Comments, "Clearing company field");
		CommonMethod.sendKeys(Comments, "GSS", "Passing data to Comments filed");
		
	}
	
	
	
	public void ClickOnApllyButton(){
		
		driver.findElement(apply).click();
	}
	
	
	public void ClickOnCancelButton(){
		
		driver.findElement(cancel).click();
	}
	
	public void ClickOnTerms() throws IOException{
		
		driver.findElement(terms).click();
		//CommonMethod.explicitWait(30, terms);

	}
	
	

}
