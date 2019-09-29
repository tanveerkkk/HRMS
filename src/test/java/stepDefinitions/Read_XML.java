package stepDefinitions;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Read_XML {

	public static void main(String[] args) throws DocumentException {

		SAXReader saxreader = new SAXReader();
		File file = new File(System.getProperty("user.dir") + "\\data.xml");

		Document document = saxreader.read(file);

		System.out.println(document.selectSingleNode("//menu/username").getText());

	}
}
