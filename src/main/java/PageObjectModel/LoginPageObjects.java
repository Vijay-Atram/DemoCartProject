package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	private WebDriver driver;
	// This Line is for demo Purpose
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	
	private By MyAccount= By.xpath("//a[@title='My Account']");
	private By Login = By.xpath("//a[contains(text(),'Login')]");
	private By Email= By.xpath("//input[@name='email']");
	private By Password= By.xpath("//input[@name='password']");
	private By ClickLogin= By.xpath("//input[@value='Login']");
	private By Continue= By.xpath("//a[contains(text(),'Continue')]");
	
	
	public WebElement ClickonMyAccount() {
		return driver.findElement(MyAccount);
	}
	public WebElement ClickOnLogin() {
		return driver.findElement(Login);
	}
	public WebElement enterEmail() {
		return driver.findElement(Email);
	}
	public WebElement EnterPasscode() {
		return driver.findElement(Password);
	}
	public WebElement ClickLogin() {
		return driver.findElement(ClickLogin);
	}
	public WebElement ClickContinue() {
		return driver.findElement(Continue);
	}

}
