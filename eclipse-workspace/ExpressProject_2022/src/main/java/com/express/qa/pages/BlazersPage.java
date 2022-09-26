package com.express.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.express.qa.base.TestBase;

public class BlazersPage extends TestBase{

	@FindBy(xpath="//a[text()='Blazers']")
	WebElement Blazerspage;
	
	//@FindBy(xpath="//a[(text()='Slim Solid Black Modern Tech Suit Jacket')]")
	//WebElement ProductPage;
	
	
	public BlazersPage() {
		PageFactory.initElements(driver, this);
	}
	
	public  ProductPage  clickOnBlazersPage() {
		Blazerspage.click();
		return new ProductPage();
	}
	

	
}
