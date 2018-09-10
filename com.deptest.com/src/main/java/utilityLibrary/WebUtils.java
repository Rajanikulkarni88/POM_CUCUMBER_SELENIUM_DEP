package utilityLibrary;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebUtils {
	public static WebDriver driver;

	public Random rand = new Random(); 
	public int value = rand.nextInt(1000); 
	
public static void openbrwoser(String url) {
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver2.41.exe");
	driver = new ChromeDriver();		
	System.out.println("url::"+url);
	driver.get(url);
	System.out.println("Browser Opened");
	driver.manage().window().maximize();
}

public static void entervalue(String val,By locator)
{
	WebElement ele = driver.findElement(locator);
	System.out.println("Entering Value");
	ele.clear();
	ele.sendKeys(val);
	
}

public static void clickbutton(By locator)throws InterruptedException
{
	WebElement ele = driver.findElement(locator);
	System.out.println("Clicking on button");
	ele.click();
	
}

public static  void clickitem(By locator)throws InterruptedException
{
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.switchTo().frame("deputy-app-view1422");
	WebElement ele = driver.findElement(locator);
	System.out.println("Clicking on Add Employee");
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	ele.click();
	
}

public static void clickImagebutton(By locator)throws InterruptedException
{
	driver.switchTo().defaultContent();
	WebElement ele = driver.findElement(locator);
	System.out.println("Clicking on button");
	ele.click();
	
}
public static void enterfirstname(String val,By locator)
{
	driver.switchTo().defaultContent();
	WebElement ele = driver.findElement(locator);
	System.out.println("Entering first name");
	ele.clear();
	ele.sendKeys(val);
}

public static void uploadimage(String  val, By locator)
{
	
	driver.switchTo().defaultContent();
	WebElement ele = driver.findElement(locator);
	System.out.println("Uploaded Image");
	ele.sendKeys("");
}

public static void entergmailusername(String val,By locator)
{
	driver.switchTo().defaultContent();
	WebElement ele = driver.findElement(locator);
	System.out.println("Entering gmailuser name");
	ele.clear();
	ele.sendKeys(val);
}


public static void clicksavebutton(By locator)throws InterruptedException
{
	driver.switchTo().defaultContent();
	WebElement ele = driver.findElement(locator);
	System.out.println("Clicking on button");
	ele.click();
}


public static void closethedriver()
{
	System.out.println("Closing the browser");
	driver.close();
}

public static void emailaddress(String val, double d, By locator) {
	WebElement ele = driver.findElement(locator);
	System.out.println("Entering Value");
	ele.clear();
	ele.sendKeys(val);
	
}

@Test
public void TakeScreenshot(WebDriver driver, String screenshotName) throws Exception
{
	
	try 
	{	
	TakesScreenshot ts =(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./screenshots/"+screenshotName+".png"));
	System.out.println("screen shots captured");
	}
	
	catch (Exception e)
	{
		System.out.println("Exception while taking screenshot" +e.getMessage());
	}
}

}
