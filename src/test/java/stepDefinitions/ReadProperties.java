package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();

		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\data.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
