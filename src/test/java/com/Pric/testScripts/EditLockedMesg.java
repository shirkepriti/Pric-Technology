package com.Pric.testScripts;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.pric.GenericUtility.BaseCLass;
import com.pric.GenericUtility.RandomNumber;
import com.pric.Pom.Pric;

@Listeners(Listners.Edit_Existing_locked_Mesg.class)
public class EditLockedMesg extends BaseCLass {
	@Test
	public void edit_mesg() throws IOException, InterruptedException
	{
		//preCondition();
		//login();
     	Pric p=new Pric(driver);
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = RandomNumber.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("prita");
 	    p.preminumContent.sendKeys("724");
		p.submit.click();
       p.edit.click();
       p.visible_Mesg.clear();
       p.visible_Mesg.sendKeys("hioejns");
       p.submit.click();
       p.Home.click();
}
}

