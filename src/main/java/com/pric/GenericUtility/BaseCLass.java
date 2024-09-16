package com.pric.GenericUtility;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pric.Pom.Pric;

public class BaseCLass {

	public static WebDriver driver;
	public FileUtility file = new FileUtility();
	public JavaUtility javaUtility=new JavaUtility();
	public WebdriverUtility webdriverUtility=new WebdriverUtility();

	@BeforeClass
	public void preCondition() throws IOException {
		System.out.println("@BeforeClass");

		String browser = file.readPropertyDate("browser");
		String url = file.readPropertyDate("url");

		if (browser.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.contains("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Enter Valid Browser Name");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

	@BeforeMethod
		public void login() throws IOException, InterruptedException
		{
			String mob = FileUtility.readPropertyDate("mobnum");
			
			 Pric p=new Pric(driver);
			
			otpValidate();
			
		}
	public void otpValidate() throws InterruptedException
	{
		Scanner s=new Scanner(System.in);
		 
		Pric p = new Pric(driver);
		Reporter.log("Enter number",true);
		driver.findElement(By.name("tel")).sendKeys(""+s.next());
		Thread.sleep(2000);
		p.send_otp.click();
	 Reporter.log("enter first",true);
	driver.findElement(By.xpath("(//input[@class='pincode-input-text'][1])")).sendKeys(""+s.nextInt());
	 Reporter.log("enter second",true);
	 driver.findElement(By.xpath("(//input[@class='pincode-input-text'][2])")).sendKeys(""+s.nextInt());
	 Reporter.log("enter third",true);
	 driver.findElement(By.xpath("(//input[@class='pincode-input-text'][3])")).sendKeys(""+s.nextInt());
	 Reporter.log("enter fourth",true);
	 driver.findElement(By.xpath("(//input[@class='pincode-input-text'][4])")).sendKeys(""+s.nextInt());
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
	}
	@AfterMethod
		public void logout() throws InterruptedException
		{
			System.out.println("Aftermethod");
			
			 Pric p = new Pric(driver);
			
			Thread.sleep(10000);
			
			 Actions act = new Actions(driver);
			
		    act.moveByOffset(90, 600);
		    
			act.keyDown(Keys.PAGE_DOWN);
            act.keyDown(Keys.PAGE_DOWN);
			
			//act.keyDown(Keys.PAGE_DOWN);
			
			act.build().perform();

			Thread.sleep(4000);
		
			p.signOut1.click();
					
			p.signout2.click();
			}

	@AfterClass
	public void preCondition1() {
		driver.quit();
	}

}
