package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.TotalPricePageObjects;
import Resources.BaseClass;

public class TotalPriceComparison extends BaseClass {
	
	@Test
	public void ShoppingFromDemoCart() {
		TotalPricePageObjects tpo = new TotalPricePageObjects(driver);
		tpo.ClickSearch().click();
	}

}
