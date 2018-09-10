package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilityLibrary.WebUtils;

public class ElementLocators_deputyfood extends WebUtils{
	public WebDriver driver;
	
	public ElementLocators_deputyfood(WebDriver driver){
        this.driver=driver;
    }
	
	public static By Username = By.id("login");
	public static By Password = By.id("password");
	public static By LoginButton = By.id("btnLogin");
	public static By Scheduletab = By.linkText("Schedule");
	public static By AddEmployee = By.xpath("//div[@class='roster-emp wev-row']");
	public static By FirstName = By.xpath("//*[@id='txtTeamProfileEditFirstName']");
	public static By LastName =  By.id("txtTeamProfileEditLastName");
	public static By Email = By.id("txtTeamProfileEditEmail");
	public static By Mobile = By.id("txtTeamProfileEditMobile");
	public static By Image = By.id("btnTeamProfilePhoto");
	public static By SaveDetails = By.id("btnTeamProfileSave");
	public static By TestEmail =By.id("inboxfield");
	public static By Testpwd = By.id("password");
	public static By Nextbutton = By.xpath("//span[@class='input-group-btn']");
	public static By VerifyLink = By.linkText("https://once.deputy.com/my/");
	public static By VerifyName = By.name("head-emp-name");
	
}