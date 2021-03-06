package mavenpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseclassTest {
	

		WebDriver driver;
		@Parameters("browser")
		@BeforeClass
		public void Openhrome(@Optional("chrome") String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
				driver=new FirefoxDriver();
			}
		}
		@AfterClass
		public void CloseBrowser() {
			driver.close();
		}

	}
	
	
	
	
	
	
	


