package weDevs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Vendor {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		page();
		//regV();
		//regC();
		loginC();
		//loginV();

	}
	public static void page() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\eclipse-workspace\\automationTesting\\browserDriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://dokan.ajaira.website/my-account/");
		driver.manage().window().maximize();
	}
	public static void regV() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'reg_email\']")).sendKeys("tarexsq82220@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'reg_password\']")).sendKeys("tareq32Password@");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/article/div/div/div[2]/div[2]/form/p[3]/label[2]/input")).click();
		//*[@id="first-name"]
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Mohammad");
		//*[@id="last-name"]
		driver.findElement(By.xpath("//*[@id=\'last-name\']")).sendKeys("Tareq");
		//*[@id="company-name"]
		driver.findElement(By.xpath("//*[@id=\'company-name\']")).sendKeys("TAREQ");
		//*[@id="seller-url"]
		driver.findElement(By.xpath("//*[@id=\'seller-url\']")).sendKeys("mddtareq.com");
		//*[@id="shop-phone"]
		driver.findElement(By.xpath("//*[@id=\'shop-phone\']")).sendKeys("01982667024");
		driver.findElement(By.xpath("//*[@id=\'register\']/p[4]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/p[3]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"store_ppp\"]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"address[street_1]\"]")).sendKeys("b/71");
		driver.findElement(By.xpath("//*[@id=\"address[street_2]\"]")).sendKeys("9");
		driver.findElement(By.xpath("//*[@id=\"address[city]\"]")).sendKeys("Dhaka");
		//*[@id="address[zip]"]
		driver.findElement(By.xpath("//*[@id=\"address[zip]\"]")).sendKeys("1219");
		//driver.findElement(By.xpath("//*[@id=\"select2-addresscountry-container\"]")).click();
		//Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"select2-addresscountry-container\"]")));
		//s1.selectByIndex(5);
		//s1.selectByVisibleText("Bangladesh");
		//Select s2=new Select(driver.findElement(By.xpath("//*[@id=\"select2-calc_shipping_state-container\"]]")));
		//s2.selectByVisibleText("Dhaka");

		driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[8]/td/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/form/p/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[2]/td/div[1]/div/input")).sendKeys("tareq");
		driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[2]/td/div[2]/div/input")).sendKeys("667024");
		driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[2]/td/div[3]/div/input")).sendKeys("dhaka");
		driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[2]/td/div[4]/div/textarea")).sendKeys("1219/25");
		driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[2]/td/div[5]/div/input")).sendKeys("12019");
		driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[2]/td/div[6]/div/input")).sendKeys("219");
		driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr[2]/td/div[7]/div/input")).sendKeys("121");
		driver.findElement(By.xpath("/html/body/div[1]/form/p/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/p/a")).click();

	}
	public static void loginV() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("tareq8@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("tareq32Password");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/article/div/div/div[2]/div[1]/form/p[4]/button")).click();
		Thread.sleep(10000);
		
		
		
		//*[@id="dokan-navigation"]/ul/li[2]/a
		driver.findElement(By.xpath("//*[@id=\'dokan-navigation\']/ul/li[2]/a")).click();
		//*[@id="post-5"]/div/div/div[2]/article/div[1]/span/a[1]
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/article/div/div/div[2]/article/div[1]/span/a[1]")).click();
		//*[@id="dokan-add-new-product-form"]/div[1]/div[2]/div[1]/input
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div[1]/div[2]/div[1]/input")).sendKeys("mobile");
		//*[@id="dokan-add-new-product-form"]/div[1]/div[2]/div[2]/div[1]/div[1]/div/input
		driver.findElement(By.xpath("//*[@id=\'dokan-add-new-product-form\']/div[1]/div[2]/div[2]/div[1]/div[1]/div/input")).sendKeys("121");
		//*[@id="select2-product_cat-container"]
		driver.findElement(By.xpath("//*[@id=\'select2-product_cat-container\']")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		//Select s3=new Select(driver.findElement(By.xpath("//*[@id=\'select2-product_cat-container\']")));
		//s3.selectByVisibleText("Uncategorized");
		//*[@id="dokan-add-new-product-form"]/div[1]/div[4]/div[3]/textarea
		driver.findElement(By.xpath("//*[@id=\'dokan-add-new-product-form\']/div[1]/div[4]/div[3]/textarea")).sendKeys("Buy");
		//*[@id="dokan-create-new-product-btn"]
		driver.findElement(By.xpath("//*[@id=\'dokan-create-new-product-btn\']")).click();
		Thread.sleep(5000);
		//*[@id="dokan-navigation"]/ul/li[4]/a
		//*[@id="post-5"]/div/div/div[2]/article/header/span/h1/span/a
		driver.findElement(By.xpath("//*[@id=\'dokan-navigation\']/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'post-5\']/div/div/div[2]/article/header/span/h1/span/a")).click();
		//*[@id="title"]
		driver.findElement(By.xpath("//*[@id=\'title\']")).sendKeys("25%");
		//*[@id="amount"]
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("2500");
		driver.findElement(By.xpath("//*[@id=\'post-5\']/div/div/div[2]/article/form/div[10]/div/span/span[1]/span/ul/li/input")).click();
		driver.findElement(By.xpath("/html/body/span/span/span/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"post-5\"]/div/div/div[2]/article/form/div[13]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\'page\']/nav/div/div/div[2]/div/ul/li[4]/a")).click();
	}
	public static void regC() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'reg_email\']")).sendKeys("tareq7788@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'reg_password\']")).sendKeys("tareq32Password@");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/article/div/div/div[2]/div[2]/form/p[4]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"page\"]/nav/div/div/div[2]/div/ul/li[3]/a")).click();
	}
	public static void loginC() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("tareq88@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("tareq32Password@");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/article/div/div/div[2]/div[1]/form/p[4]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/footer/div[2]/div/div/div/div/div[2]/div/ul/li[7]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/main/ul/li[9]/a/img")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/main/div[2]/div[2]/form/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/main/div[1]/div/a")).click();

		driver.findElement(By.xpath("//*[@id=\'coupon_code\']")).sendKeys("25%");
		driver.findElement(By.xpath("//*[@id=\'post-10\']/div/div/form/table/tbody/tr[2]/td/div/button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/article/div/div/div[2]/div/div/a")).click();

		driver.findElement(By.xpath("//*[@id=\'billing_first_name\']")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//*[@id=\'billing_last_name\']")).sendKeys("Tareq");
		driver.findElement(By.xpath("//*[@id=\'select2-billing_country-container\']")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[19]")).click();
		//*[@id="select2-billing_country-result-p0xg-BD"]
		driver.findElement(By.xpath("//*[@id=\'billing_address_1\']")).sendKeys("25/320");
		driver.findElement(By.xpath("//*[@id=\'billing_postcode\']")).sendKeys("1219");
		driver.findElement(By.xpath("//*[@id=\'billing_city\']")).sendKeys("Dhaka");
		driver.findElement(By.xpath("//*[@id=\'select2-billing_state-container\']")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[13]")).click();
		driver.findElement(By.xpath("//*[@id=\'billing_phone\']")).sendKeys("01982667024");
		//driver.findElement(By.xpath("//*[@id=\'billing_email\']")).sendKeys("tareq299@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'place_order\']")).click();




	}
	public static void close() {
		driver.close();;
	}
}
