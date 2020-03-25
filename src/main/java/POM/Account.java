package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Autoconstant;
import Generic.excellib;

public class Account implements Autoconstant {

	@FindBy(xpath="//div[.=' Login or Create Account']")
	public WebElement login;
	
	@FindBy(xpath="//a[.=' Create New Account ']")
	public WebElement create;

	@FindBy(id="emailOrPhone")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public WebElement clk;
	
	public Account(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void tour() throws IOException, InterruptedException{
		login.click();
		create.click();
		username.sendKeys(excellib.getcellvalue(excel_path, 1, 0, sheet));
		Thread.sleep(3000);
		pass.sendKeys(excellib.getcellvalue(excel_path, 1, 1, sheet));
		Thread.sleep(3000);
		clk.click();
	}
}
