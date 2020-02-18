package wordpress;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class wordpressSite {
	static WebDriver driver;
	static Screen scr;
public static  void main(String[] args)throws FindFailed{
	page();
	testWorksikuli();
	//testWork();
	//close();
}
public static void page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\automationTesting\\browserDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://wordpress.com/");
}
public static void testWorksikuli() throws FindFailed {
	//driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/header/nav/ul[2]/li[1]/a")).click();
	scr=new Screen();
	Pattern image1=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\wordpress\\w1.PNG");
	Pattern image2=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\wordpress\\W2.PNG");
	Pattern image3=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\wordpress\\W3.PNG");
	Pattern image4=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\wordpress\\W4.PNG");
	Pattern image5=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\wordpress\\W5.PNG");
	Pattern image6=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\wordpress\\W6.PNG");
	Pattern image7=new Pattern("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\sikuliImage\\wordpress\\W7.PNG");
	scr.click(image1);
	scr.type(image2,"mddtareq");
	scr.click(image3);
	scr.type(image4,"1Nov96mD667024");
	scr.click(image5);
	scr.click(image6);
	scr.type(image7,"Try New");
	//*[@id="header"]/div[1]/a/svg
	//driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/header/nav/ul[2]/li[1]/a")).click();
}
public static void testWork() {
	driver.findElement(By.xpath("//*[@id=\'header\']/div[1]/a/svg")).click();
}
public static void close() {
	driver.close();
}
}
