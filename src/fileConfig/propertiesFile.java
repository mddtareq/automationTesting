package fileConfig;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import browserCheck.browseDriver;

public class propertiesFile {
	static Properties pro=new Properties();
	public static void main(String[] args) {
		readProperties();
		setProperties();
	}
	public static void readProperties() {
		try {
			InputStream input =new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\src\\fileConfig\\config.properties");
			pro.load(input);
			System.out.println(pro.getProperty("browser"));
			//System.out.println(pro.getProperty("Love"));
			//System.out.println(pro.getProperty("Loved"));
			browseDriver.browser=pro.getProperty("browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void setProperties() {
		
		try {
			OutputStream output =new FileOutputStream("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\src\\fileConfig\\config.properties");
			pro.setProperty("browser", "Chrome");
			pro.setProperty("Love", "Tareq");
			pro.store(output, "love");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
