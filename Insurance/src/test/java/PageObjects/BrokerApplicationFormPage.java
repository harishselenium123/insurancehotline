package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;

import genericLibraries.BaseClass;
import genericLibraries.CommonMethod;

public class BrokerApplicationFormPage extends BaseClass {
	
	
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
	
	public void fillBrokerAgentApplicationForm(){
		
		String cName = data.getCellData("Add Registration", "CompanyName", 2);
		String contacName = data.getCellData("Add Registration", "ContactName", 2);
		String TelephoneName = data.getCellData("Add Registration", "Telephone", 2);
		String EmailAddressName = data.getCellData("Add Registration", "EmailAddress", 2);
		String WebsiteAddressName = data.getCellData("Add Registration", "WebsiteAddress", 2);
		String InsuranceCompaniesName = data.getCellData("Add Registration", "InsuranceCompanies", 2);
		String RegionsName = data.getCellData("Add Registration", "Regions", 2);
		String CommentsName = data.getCellData("Add Registration", "Comments", 2);
		
		driver.findElement(companyName).clear();
		driver.findElement(companyName).sendKeys(cName);
		
		driver.findElement(ContactName).clear();
		driver.findElement(ContactName).sendKeys(contacName);
		
		driver.findElement(Telephone).clear();
		driver.findElement(Telephone).sendKeys(TelephoneName);
		
		driver.findElement(EmailAddress).clear();
		driver.findElement(EmailAddress).sendKeys(EmailAddressName);
		
		
		driver.findElement(WebsiteAddress).clear();
		driver.findElement(WebsiteAddress).sendKeys(WebsiteAddressName);
		
		driver.findElement(LinesofBusiness).click();
		
		
		driver.findElement(InsuranceCompanies).clear();
		driver.findElement(InsuranceCompanies).sendKeys(InsuranceCompaniesName);
		
		
		driver.findElement(Regions).clear();
		driver.findElement(Regions).sendKeys(RegionsName);
		
		
		driver.findElement(Comments).clear();
		driver.findElement(Comments).sendKeys(CommentsName);
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
