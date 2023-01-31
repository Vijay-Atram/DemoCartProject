package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.LoginData;

public class LoginInDemoCart extends BaseClass {
	@Test
	public void UserLogin() throws InterruptedException  {
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.ClickonMyAccount().click();
		lpo.ClickOnLogin().click();
		lpo.enterEmail().sendKeys(LoginData.Email);
		lpo.EnterPasscode().sendKeys(LoginData.Password);
		lpo.ClickLogin().click();
		Thread.sleep(2000);
		
		
	}

}
