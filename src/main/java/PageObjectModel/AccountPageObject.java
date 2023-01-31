package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPageObject {
	private WebDriver driver;
	
	public AccountPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	
	private By MyAccount= By.xpath("//a[@title='My Account']");
	private By Register = By.xpath("//a[contains(text(),'Register')]");
	private By FirstName = By.xpath("//input[@name='firstname']");
	private By LastName = By.xpath("//input[@name='lastname']");
	private By Email = By.xpath("//input[@name='email']");
	private By Telephone = By.xpath("//input[@name='telephone']");
	private By Password = By.xpath("//input[@name='password']");
	private By Confirm = By.xpath("//input[@name='confirm']");
	private By Agree = By.xpath("//input[@name='agree']");
	private By Continue = By.xpath("//input[@value='Continue']");
	private By Logout = By.xpath("(//a[contains(text(),'Logout')])[2]");
	
	
	public WebElement ClickonMyAccount() {
		return driver.findElement(MyAccount);
	}
	public WebElement ClickOnRegister() {
		return driver.findElement(Register);
	}
	public WebElement enterFirstName() {
		return driver.findElement(FirstName);
	}
	public WebElement enterLastName() {
		return driver.findElement(LastName);
	}
	public WebElement enterEmail() {
		return driver.findElement(Email);
	}
	public WebElement enterNumber() {
		return driver.findElement(Telephone);
	}
	public WebElement enterpassword() {
		return driver.findElement(Password);
	}
	public WebElement confirm() {
		return driver.findElement(Confirm);
	}
	public WebElement ClickOnAgree() {
		return driver.findElement(Agree);
	}
	public WebElement ClickOnContinue() {
		return driver.findElement(Continue);
	}
	public WebElement ClickOnLogout() {
		return driver.findElement(Logout);
	}
	

	
		
	

}
