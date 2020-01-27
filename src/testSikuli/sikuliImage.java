package testSikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikuliImage {
	static WebDriver driver;
	static Screen scr;
	public static void main(String[] args) throws FindFailed {
		driver();
		sikuli();
	}
	public static void sikuli() throws FindFailed  {
		scr=new Screen();
		Pattern image1=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\gmail.PNG");
		Pattern image2=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\Create An Account.PNG");
		Pattern image3=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\firstname.PNG");
		Pattern image4=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\last name.PNG");
		Pattern image41=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\lastname.PNG");
		Pattern image5=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\mail.PNG");
		Pattern image51=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\username.PNG");
		Pattern image6=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\psd.PNG");
		Pattern image61=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\password.PNG");
		Pattern image7=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\confirmpsd.PNG");
		Pattern image71=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\confirmpassword.PNG");
		Pattern image8=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\google\\next.PNG");
		scr.click(image1);
		scr.click(image2);
		scr.type(image3,"Mohammad");
		scr.click(image4);
		scr.type(image41,"Tareq");
		scr.click(image5);
		scr.type(image51,"tareq");
		scr.click(image6);
		scr.type(image61,"passwordtareq");
		scr.click(image7);
		scr.type(image71,"passwordnadia");
		scr.click(image8);
	}
	public static void driver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\eclipse-workspace\\try\\brow\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
}
