package browserCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import fileConfig.propertiesFile;

public class browseDriver {
	public static String browser;
	static WebDriver driver;
	public static void main(String[] args) {
		//setBrowser();
		propertiesFile.readProperties();
		setBrowserConfig();
		runTest();
	}
	public static void setBrowser() {
		//browser="Firefox";
		browser="Chrome";
	}
	public static void setBrowserConfig() {
		if(browser.contains("Firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\eclipse-workspace\\automationTesting\\browserDriver\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		if(browser.contains("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\automationTesting\\browserDriver\\chromedriver.exe");
			driver =new ChromeDriver();
		}
	}
	public static void runTest() {
		driver.get("http://facebook.com");
		driver.close();
	}


}
