package Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public void selectByVisibleText(WebElement element,String visibletext)
	{
		Select s=new Select(element);
		s.selectByVisibleText(visibletext);
	}

	public void selectByValue(WebElement element)
	{
		String s=new Select(element).getFirstSelectedOption().getText();
		
	}
	
	public void selectByIndex(WebElement element,int i)
	{
		Select s=new Select(element);
		s.selectByIndex(i);
		
	}
}
