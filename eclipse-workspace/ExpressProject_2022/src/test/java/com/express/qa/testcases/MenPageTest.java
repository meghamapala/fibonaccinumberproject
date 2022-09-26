package com.express.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.express.qa.base.TestBase;
import com.express.qa.pages.BlazersPage;
import com.express.qa.pages.MenPage;

public class MenPageTest extends TestBase{
	
	MenPage menpage;
	BlazersPage blazerspage;
	
	public MenPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		menpage = new MenPage();
		blazerspage = new BlazersPage(); 
	}
	
	@Test
	public void menPageTest() throws InterruptedException  {
		blazerspage = menpage.clickOnMenPage();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
