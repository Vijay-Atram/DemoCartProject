package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalPricePageObjects {
	public WebDriver driver;
	public TotalPricePageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	
	private By ClickOnSearch= By.xpath("//input[@placeholder='Search']");
	
	

	public WebElement ClickSearch() {
		return driver.findElement(ClickOnSearch);
	}

}
