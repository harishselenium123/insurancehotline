package Utilities;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
public class SendReports

{
	 static List<String> filesListInDir = new ArrayList<String>();
	
		 	File filename=null;
		 	
		 	 ZIPFile zip = new ZIPFile();
			  
	

		public void zipAutomationReports() throws InterruptedException, ParserConfigurationException, IOException, SAXException{
			 File filename = new File(System.getProperty("user.dir")+"/CustomReports");	
			 zip.zipDirectory(filename, "AutomationReports.zip");
			 System.out.println("Zipping of AutomationReports successfully");
			 Thread.sleep(3000);

		}

		public void sendmail() throws ParserConfigurationException, SAXException, IOException
	
		{
			String username="rajeshtcemsportal@gmail.com";
			String password="taskit@123";
			String toadd="sudharsan.selenium@gmail.com";
			String ccadd="harish.kilaru@gmail.com";
			String bccadd="harish.kilaru@gmail.com";
			String Subject="Test Automation Reports";
			
			
			
				  String[] to={toadd};
				  String[] cc={ccadd};
	              String[] bcc={bccadd};
	              
	              
	              
	              SMTPUtility.sendMail(username,
	            		  password,
	              		            "smtp.gmail.com",
	              		            "465",
	              		            "true",
	              		            "true",
	              		            true,
	              		            "javax.net.ssl.SSLSocketFactory",
	              		            "false",
	              		            to,   
	              		            cc,
	              		            bcc,
	              		          Subject,                		            
	              		            "PFA",System.getProperty("user.dir")+"/AutomationReports.zip","AutomationReports.zip");
	            
	              System.out.println("Report has been sent through mail Successfully");
	
				}

		      public void Sharereports() {
		    	  try{
		    		  zipAutomationReports();
		  			sendmail();
		 
		    	  }
		    	  catch(Throwable t) 
		  	    {	
		  		      Error e1 = new Error(t.getMessage()); 
		  		      e1.setStackTrace(t.getStackTrace()); 
		  		      throw e1;
		  	   }	
		    	  
		      }
      
      
      
     
			}
