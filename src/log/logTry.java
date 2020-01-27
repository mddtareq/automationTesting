package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logTry {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		tryLog();
		close();
	}
	public static void tryLog() throws InterruptedException {
		Logger logger=Logger.getLogger("Demo");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\eclipse-workspace\\try\\brow\\geckodriver.exe");
		driver=new FirefoxDriver();
		logger.info("Firebox Opened");
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		logger.info("Go to Site");
		driver.findElement(By.xpath("//*[@id=\'bookingsForm\']/div/div/div[2]/div[3]/button")).click();
		logger.info("Click on Search Button");
		Thread.sleep(1000);
		Alert alt=driver.switchTo().alert();
		logger.info("Alert");
		alt.accept();
	}
	public static void close() {
		driver.close();;
	}
}
