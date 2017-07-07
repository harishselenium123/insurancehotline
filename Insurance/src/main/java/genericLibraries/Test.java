package genericLibraries;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import Utilities.XmlReader;

public class Test {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		String sal = XmlReader.getDataFromXml("company","salary");
		System.out.println(sal);
	}

}
