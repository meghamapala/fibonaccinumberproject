package com.express.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.express.qa.base.TestBase;
import com.express.qa.pages.BlazersPage;
import com.express.qa.pages.MenPage;

public class BlazersPageTest extends TestBase {
	
   MenPage menpage;
   BlazersPage blazerspage;
	
	public BlazersPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		blazerspage = new BlazersPage();
		menpage = new MenPage();
		blazerspage.clickOnBlazersPage();
    }
	
	@Test
	public void blazersPageTest() throws InterruptedException{
		blazerspage.clickOnBlazersPage();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
