package datadrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class datadrivenExel {
	static WebDriver driver;
	@BeforeMethod
	public static void page() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\eclipse-workspace\\automationTesting\\browserDriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="testdata")
	public static void login(String username, String password)
	{
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
		driver.navigate().back();
		driver.navigate().back();
	}
	@AfterMethod
	public static void close() {
		driver.close();;
	}
	@DataProvider(name="testdata")
	public Object[][] testDataFeed()
	{
		datadrivenValues config = new datadrivenValues("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\exelFile\\datadrivenValues.xlsx");
		int rows = config.getRowCount(0);
		Object[][] credentials = new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
			credentials[i][0] = config.getData("user", i, 0);
			credentials[i][1] = config.getData("user", i, 1);
		}

		return credentials;
	}
}