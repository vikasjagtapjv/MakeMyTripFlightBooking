package com.makemytrip.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.makemytrip.base.Base;

public class ActionsClass extends Base {
	public void clickAndHoldAction(WebElement e)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(e).build().perform();
	}
	public void clickAction(WebElement e)
	{
		Actions act=new Actions(driver);
		act.click(e).build().perform();
	}
	public void doubleClickAction(WebElement e)
	{
		Actions act=new Actions(driver);
		act.doubleClick(e).build().perform();
	}

}
