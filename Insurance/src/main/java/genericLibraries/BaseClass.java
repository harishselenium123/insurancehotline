package genericLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utilities.PropertyFileReader;
import Utilities.Xls_Reader;

public class BaseClass {
	
	public static WebDriver driver;
	public static Xls_Reader data;
	public  static ExtentReports extent;
	public  static ExtentTest test;
	public static Logger log = Logger.getLogger("BaseClass");
	
@BeforeClass	
@Parameters("browserName")
public void initilization(String browserName) throws InterruptedException, IOException{
		
		//Customization Report
	    extent = new ExtentReports(System.getProperty("user.dir")+"/CustomReports/Report.html");
	    extent.loadConfig(new File(System.getProperty("user.dir")+"/src/main/resources/Configuaration/extent-config.xml"));
	
		//Logs
		//Configuring properties of Log4j
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources//Configuaration/Log4j.properties");
		prop.load(file);
		PropertyConfigurator.configure(prop);
		log.info("Configuration of reporting logs successfully..........");

		extent.addSystemInfo("BrowserName", browserName);
	
		if(browserName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/DriverFiles/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else{
			
			System.out.println("Incorrect browserName");
			throw new RuntimeException("Incorrect browserName");
		}
		
		  driver.manage().window().maximize();
		
		  String url = PropertyFileReader.getProperty("URL");
		  driver.get(url);
		  Thread.sleep(3000);
		  //PropertyFileReader.setProperty("", Value);
	
	
	
	data = new Xls_Reader(System.getProperty("user.dir")+"/src/main/resources/Configuaration/Testdata.xlsx");
	
}
	
	@AfterClass
	public void end(){
		
		driver.quit();
		
	}

	@AfterMethod
    protected void afterEachTest(ITestResult result) {
        extent.endTest(test);        
        extent.flush();
    }

}
