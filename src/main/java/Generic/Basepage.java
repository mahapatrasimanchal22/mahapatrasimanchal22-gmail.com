package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Basepage {
	
public void selectvisibleindex(WebElement element, int index){
		Select sel=new Select(element);
			sel.selectByIndex(index);
	}
public void selectvisiblevalue(WebElement element, String value){
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public void selectvisibletext(WebElement element, String text){
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}


}

