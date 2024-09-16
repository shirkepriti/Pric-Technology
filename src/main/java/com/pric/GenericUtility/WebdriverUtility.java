package com.pric.GenericUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	public void selectByValue(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}

}
