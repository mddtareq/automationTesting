package multiWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiWindows {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	switchDemo();
}
public static void switchDemo() throws InterruptedException   {	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\eclipse-workspace\\automationTesting\\browserDriver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	String parent=driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Mohammad");
	WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	newTab.get("https://www.cricbuzz.com/");
	newTab.findElement(By.xpath("//*[@id=\'search_bar\']")).sendKeys("Tamim Iqbal");
	newTab.findElement(By.xpath("//*[@id=\'cb-main-menu\']/div[7]/div/div/form/div[2]/a")).click();
	Thread.sleep(1000);
	newTab.close();
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//*[@id=\'u_0_r\']")).sendKeys("tareq@gmail.com");
	driver.findElement(By.xpath("//*[@id=\'u_0_13\']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
