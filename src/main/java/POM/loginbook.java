package POM;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Autoconstant;
import Generic.Basepage;
import Generic.excellib;

public class loginbook extends Basepage implements Autoconstant   {

	@FindBy(xpath="//div[.=' Login or Create Account']")
	public WebElement clkloginpage;
	
	@FindBy(xpath="//input[@placeholder='Enter email or mobile number']")
	public WebElement enteremail;
	
	@FindBy(xpath="//button[.='Continue']")
	public WebElement cont;
	
	@FindBy(id="password")
	public WebElement enterpass;
	
	@FindBy(xpath="//button[@data-cy='login']")
	public WebElement clklogin;
	
	@FindBy(xpath="//span[@data-cy='modalClose']")
	public WebElement close;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	public WebElement from;
	
	@FindBy(xpath="//p[.='Bhubaneswar, India']")
	public WebElement fromclk;
	
	@FindBy(xpath="//input[@placeholder='To']")
	public WebElement to;
	
	@FindBy(xpath="//p[.='Bengaluru, India']")
	public WebElement toclk;
	
	@FindBy(xpath="//span[.='DEPARTURE']")
	public WebElement clkdep;
	
	@FindBy(xpath="//span[@aria-label='Next Month']")
	public WebElement clkcal;
	
	@FindBy(xpath="(//p[.='22'])[1]")
	public WebElement go;
	
	@FindBy(xpath="//span[.='RETURN']")
	public WebElement returnclk;
	
	@FindBy(xpath="//div[@aria-label='Mon Mar 08 2021']")
	public WebElement come;
	
	@FindBy(xpath="//span[.='Travellers & CLASS']")
	public WebElement passenger;
	
	@FindBy(xpath="//li[@data-cy='adults-2']")
	public WebElement passengerlist;
	
	@FindBy(xpath="//button[.='APPLY']")
	public WebElement apply;
	
	@FindBy(xpath="//a[.='Search']")
	public WebElement search;
	
	@FindBy(xpath="//button[.='Book Now']")
	public WebElement book;
	
	public loginbook(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ticket() throws IOException, InterruptedException{
		
		clkloginpage.click();
		enteremail.sendKeys(excellib.getcellvalue(excel_path, 1, 0, sheet));
		Thread.sleep(3000);
		cont.click();
		cont.click();
		enterpass.sendKeys(excellib.getcellvalue(excel_path, 1, 1, sheet));
		Thread.sleep(3000);
		clklogin.click();
		Thread.sleep(3000);
		close.click();
		Thread.sleep(3000);
		from.sendKeys(excellib.getcellvalue(excel_path, 1, 2, sheet));
		fromclk.click();
		Thread.sleep(3000);
		to.sendKeys(excellib.getcellvalue(excel_path, 1, 3, sheet));
		Thread.sleep(3000);
		toclk.click();
		clkdep.click();
		Thread.sleep(3000);
		
		for(int i=0;i<11;i++){
			clkcal.sendKeys(Keys.ARROW_RIGHT);
		}
		go.click();
		Thread.sleep(3000);
		returnclk.click();		
		Thread.sleep(3000);
		come.click();
		Thread.sleep(3000);
		passenger.click();
		Thread.sleep(3000);
		passengerlist.click();
		Thread.sleep(3000);
		apply.click();
		Thread.sleep(3000);
		search.click();
		Thread.sleep(5000);
		book.click();
		book.click();
	}
}
