package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties config= new Properties();
		
		FileInputStream fis= new FileInputStream("/Users/sagarpatel/eclipse-workspace/JavaBegins/src/config/config.properties");

		config.load(fis);
		
		String browser= config.getProperty("test_browser");
		System.out.println(browser);
		
		String url= config.getProperty("testUrl");
		System.out.println(url);
	
	}

}
