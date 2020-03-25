package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.BaseTesttrip;
import POM.loginbook;

public class tick extends BaseTesttrip{

	@Test
	public void book() throws IOException, InterruptedException{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginbook clk=new loginbook(driver);
		clk.ticket();
	}
}
