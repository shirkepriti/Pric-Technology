package com.Pric.testScripts;
import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pric.GenericUtility.BaseCLass;
import com.pric.GenericUtility.RandomNumber;
import com.pric.Pom.Pric;

@Listeners(Listners.DeleteLockedMsg.class)
public class DeleteLockedMsg extends BaseCLass{
	@Test
	public void delete_mesg() throws IOException, InterruptedException
	{
		
     	Pric p=new Pric(driver);
	
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = RandomNumber.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Prita");
 	    p.preminumContent.sendKeys("834");
		p.submit.click();
		p.delete_icon.click();
		Thread.sleep(6000);
		p.delete_button.click();
		driver.navigate().refresh();
		p.Home.click();
}
}
