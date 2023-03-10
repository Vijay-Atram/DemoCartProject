package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver browserLaunch() throws IOException {
	
		// This will help us to read data.properties file
				FileInputStream a = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

				// This will access the data.properties
				prop = new Properties();
				prop.load(a);
				String browserName = prop.getProperty("browser");
				if (browserName.equalsIgnoreCase("chrome")) {
					
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					
				} else if (browserName.equalsIgnoreCase("firefox")) {

					// FireFox code
				} else if (browserName.equalsIgnoreCase("Edge")) {

					// edge code
				} else {
					System.out.println("please select valid browser");
				}
				return driver;
				// this line is for demo purpose

			}
			@BeforeMethod
			public void LaunchBrowser() throws IOException {
				browserLaunch();
				driver.get(prop.getProperty("Url"));
			}
			@AfterMethod
			public void TearDown() throws IOException {
				driver.quit();
			}

}
