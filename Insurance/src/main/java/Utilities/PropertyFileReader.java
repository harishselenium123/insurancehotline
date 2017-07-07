package Utilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyFileReader {
	
	static Properties prop = new Properties();
	static FileInputStream input = null;
	static FileOutputStream output = null;


	public static String getProperty(String key) throws IOException{
		
		input = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Configuaration/URL.properties");
		// load a properties file
		 prop.load(input);
		return prop.getProperty(key);
	
	}
	
	public static void setProperty(String key,String Value) throws IOException{
		output = new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/Configuaration/URL.properties");;
		input = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Configuaration/URL.properties");
		prop.setProperty(key, Value);
		// save properties to project root folder
		prop.store(output, null);
		
	}
	
	

}
