package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.AccountPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;

public class CreatingAccount extends BaseClass {
	@Test
public void AccountCreate() throws InterruptedException {
		
		
		AccountPageObject apo = new AccountPageObject(driver);
		
		apo.ClickonMyAccount().click();
		apo.ClickOnRegister().click();
		apo.enterFirstName().sendKeys(TestCaseData.username);
		apo.enterLastName().sendKeys(TestCaseData.Lastname);
		apo.enterEmail().sendKeys(TestCaseData.WorkEmail);
		apo.enterNumber().sendKeys(TestCaseData.Number);
		apo.enterpassword().sendKeys(TestCaseData.Password);
		apo.confirm().sendKeys(TestCaseData.Confirm);
		apo.ClickOnAgree().click();
		apo.ClickOnContinue().click();
		//apo.ClickOnLogout().click();
	}

}
