package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import autmproj.SeleniumTest;

public class PropertiesFile {
	
	static Properties prop = new Properties();

	public static void main(String[] args) {
		
		readPropertiesFile();
		writePropertiesFile();
		

	}
    public static void readPropertiesFile(){
    	
    	
    	try {
			InputStream input = new FileInputStream ("C:\\Users\\syed\\workspace\\SelAutoProj\\src\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			SeleniumTest.browser = prop.getProperty("browser");
			System.out.println(SeleniumTest.browser);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void writePropertiesFile(){
    	
    	try {
			OutputStream output = new FileOutputStream("C:\\Users\\syed\\workspace\\SelAutoProj\\src\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
}
     
