package com.express.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.express.qa.base.TestBase;

public class MenPage extends TestBase{
	
	@FindBy(xpath="//a[text()='Men']")
	WebElement Menpage;
	
	@FindBy(xpath="//a[text()='Blazers']")
	WebElement Blazerspage;
	
	//@FindBy(xpath="//a[(text()='Slim Solid Black Modern Tech Suit Jacket')]")
	//WebElement ProductPage;
	
	
	public MenPage() {
		PageFactory.initElements(driver, this);
	}
	
	public BlazersPage  clickOnMenPage() {
		Menpage.click();
		return new BlazersPage();
	}
	
	public void clickOnNewBlazersPage() {
		Actions action = new Actions(driver);
		action.moveToElement(Blazerspage).build().perform();
	}
	
	
	
	
	
	
}
