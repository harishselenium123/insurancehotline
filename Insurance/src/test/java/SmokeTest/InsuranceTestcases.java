package SmokeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.BrokerApplicationFormPage;
import PageObjects.BrokerApplicationFormPage2;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import genericLibraries.BaseClass;
import genericLibraries.CommonMethod;

public class InsuranceTestcases extends BaseClass {
	
	
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();
	BrokerApplicationFormPage2 baForm = new BrokerApplicationFormPage2();
	
	//@Test(priority=1)
	public void testcases1() throws InterruptedException{
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement wb = driver.findElement(By.xpath("//span[contains(.,'Auto Insurance')]"));
	Actions action = new Actions(driver);
	action.moveToElement(wb).build().perform();
	
	driver.findElement(By.xpath("//span[text()='Ontario']")).click();
	Thread.sleep(5000);
			
	}
	
	/**Broker Agent Application
	 * @throws IOException 
	 *
	 */
	@Test(priority=1)
	 public void BrokerAgentRegistration() throws InterruptedException, IOException{
		test = extent.startTest("BrokerAgentRegistration");
		// home.clickonClientLogin();
		 //Thread.sleep(5000);
		 //CommonMethod.handleNewTab();
		 login.clickOnnewRegistration();
		 Thread.sleep(5000);
		 baForm.fillBrokerAgentApplicationForm();
		 baForm.ClickOnApllyButton();
		 //CommonMethod.cancelAlert();
		 data.setCellData("Add Registration", "Status", 2, "pass");		
		}
	
	//@Test(priority=2)
	public void verifyTerms() throws IOException{
		//CommonMethod.takesScreenshot("Terms");
		baForm.ClickOnTerms();
		//verify Title
		//verify URl of the page
		//verify Header of Page
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.insurancehotline.com/terms/");
		Assert.assertEquals(driver.getTitle(), "Terms & Conditions - Insurance Hotline");
		String actual = driver.findElement(By.xpath("//h1[contains(.,'InsuranceHotline.com Terms of Use')]")).getText();
		Assert.assertEquals(actual, "InsuranceHotline.com Terms of Use123");
		
	}
	
	
	
	
	
	
	

}
