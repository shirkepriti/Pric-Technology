package com.Pric.testScripts;

import org.testng.annotations.Test;

import com.pric.GenericUtility.BaseCLass;
import com.pric.Pom.Pric;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;




public class CreateLockedMsg extends BaseCLass{
	
	@Test
	public void create_mesg() throws IOException, InterruptedException
	{
		//preCondition();
		//login();
		Pric p=new Pric(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		p.amount.sendKeys("2345");
		p.visible_Mesg.sendKeys("Priti");
 	p.preminumContent.sendKeys("7861");
		p.submit.click();
		
		p.Home.click();

		
	}

}
