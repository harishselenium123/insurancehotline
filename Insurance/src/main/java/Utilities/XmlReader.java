package Utilities;


import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlReader {
	
	
	
	public static String getDataFromXml(String parent ,String childNodeName) throws ParserConfigurationException, SAXException, IOException{
		
		//Import XML-related file
		File file = new File(System.getProperty("user.dir")+"/src/main/resources/Configuaration/Test.xml");	
		
		//Create a Document build factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		//Create a Document builder
		DocumentBuilder dBuilder = dbf.newDocumentBuilder();

		//Create Document
		Document doc = dBuilder.parse(file);
		
		NodeList nList = doc.getElementsByTagName(parent);	
		
		Node nNode = nList.item(0);
		Element eElement = (Element) nNode;
		
		return eElement.getElementsByTagName(childNodeName).item(0).getTextContent();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
