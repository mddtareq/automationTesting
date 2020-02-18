package automateRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookRegistration {
	static WebDriver driver;
	public static void main(String[] args) {
		page();
		reg();
		//login();
		//loop();
		//close();
		
	}
	public static void page() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\eclipse-workspace\\automationTesting\\browserDriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://dokan.ajaira.website/my-account/");
		driver.manage().window().maximize();
	}
	public static void reg() {
		driver.findElement(By.xpath("//*[@id=\'reg_email\']")).sendKeys("Mohammad");
		//driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("Tareq");
		//driver.findElement(By.xpath("//*[@id=\'u_0_r\']")).sendKeys("tareq@gmail.com");
		//Select s1=new Select(driver.findElement(By.xpath("//*[@id='day']")));
		//s1.selectByIndex(5);
		//Select s2=new Select(driver.findElement(By.xpath("//*[@id=\'month\']")));
		//s2.selectByValue("6");
		//Select s3=new Select(driver.findElement(By.xpath("//*[@id='year']")));
		//s3.selectByVisibleText("2016");
		//driver.findElement(By.xpath("//*[@id='u_0_7']")).click();
		//driver.findElement(By.xpath("//*[@id=\'u_0_13\']")).click();
		//driver.findElement(By.className("_8esh")).click();
		
	}
	public static void login()
	{
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Mohammad Tareq");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("passWord");
		driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
		driver.navigate().back();
		driver.navigate().back();
	}	
	public static void loop() {
		for (int i = 0; i <20; i++) {
			driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
			driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Mohammad Tareq"+i);
			driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("passWord"+i);
			driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
			driver.navigate().back();
			driver.navigate().back();}
	}
	public static void close() {
		driver.close();;
	}
}
