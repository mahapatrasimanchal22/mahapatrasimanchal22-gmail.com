package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTesttrip implements Autoconstant  {

	
	public WebDriver driver;
		
		
		@BeforeSuite
		public void start(){
			System.setProperty(chrome_key,chrome_value);
			driver=new ChromeDriver();
			driver.get(URL);
		}
		/*@AfterSuite
		public void closebrowser(){
			driver.close();
		}*/

	}

