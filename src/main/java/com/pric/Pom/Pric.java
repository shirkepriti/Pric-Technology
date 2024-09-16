package com.pric.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pric {

	 
		public  Pric(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	////public @FindBy(name="tel")
	//WebElement mob_num;
	public @FindBy(linkText = "SignUp")
	WebElement signup;
	public @FindBy(name  = "name")
	WebElement name;
	 
	public @FindBy(name  = "email")
	WebElement email;
	public @FindBy(name = "city")
	WebElement city;
	public @FindBy(name = "SignUp")
	WebElement state;
	public @FindBy(xpath = "//option[@value='Maharashtra']")
	WebElement maharashtra;
	 public @FindBy(name = "price")
	WebElement amount;
	public @FindBy(xpath = "//textarea[@class='mt-3 form-control']")
	WebElement visible_Mesg;
	public @FindBy(name  = "premiumContent")
	WebElement preminumContent;
	public @FindBy(xpath = "//i[@class='fe fe-trash']")
	WebElement delete_icon;
	public @FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement delete_button;
	public @FindBy(xpath = "//div[@class='pincode-input-container']")
	WebElement otp;
		
	//public 	@FindBy(xpath="//span[text()='Sign out']")
	//WebElement sign_out;
		
	public	@FindBy(xpath = "(//button[@class='btn btn-gradient-primary'])[3]")
		WebElement create;
	public @FindBy(xpath="//button[@id='bigButton']")
	WebElement submit;
		
	public @FindBy(xpath="//button[contains(text(),'Send OTP')]")
	WebElement send_otp;
		
	public @FindBy(xpath="//span[text()='Locked Message']")
	WebElement locked;
	
	public @FindBy(xpath="//i[@class='fe fe-edit']")
	WebElement edit;

	public @FindBy(xpath="//input[@placeholder='Search...']")
	WebElement searchField;

	public @FindBy(xpath="//button[@class='btn btn-gradient-primary']")
	WebElement searchButton;

	public @FindBy(linkText ="₹ 1234")
	WebElement verify;
	public @FindBy(xpath="//td[@role='cell'][2]")
	WebElement price;
	public @FindBy(xpath="//span[text()='Sign Out']")
	WebElement signOut1;
	public @FindBy(xpath="//button[text()='Sign Out']")
	WebElement signout2;
	
	public @FindBy(xpath="//span[text()='Home']")
	WebElement Home;
		
		
	}
