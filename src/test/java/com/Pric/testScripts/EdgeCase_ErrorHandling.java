package com.Pric.testScripts;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pric.GenericUtility.BaseCLass;
import com.pric.GenericUtility.RandomNumber;
import com.pric.Pom.Pric;

@Listeners(Listners.EdgeCaseErrorHandling.class)

public class EdgeCase_ErrorHandling extends BaseCLass  {

	@Test
	public void edit_mesg() throws InterruptedException, IOException
	{
		 
     	 Pric p = new Pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = RandomNumber.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("prita");
 	    p.preminumContent.sendKeys("924");
		p.submit.click();
		Thread.sleep(3000);
		assertTrue(p.price.getText().contains(s),"It is verify");
		
		p.Home.click();
		
}
}
