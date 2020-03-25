package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import Generic.BaseTesttrip;
import POM.Account;

public class Run extends BaseTesttrip {

	@Test
	public void trip() throws IOException, InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		Account enter=new Account(driver);
		enter.tour();
	}
}
