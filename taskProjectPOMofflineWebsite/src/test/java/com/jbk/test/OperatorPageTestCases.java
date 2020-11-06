package com.jbk.test;


import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.jbk.pages.Dashboardpage;
import com.jbk.pages.LoginPageS;
import com.jbk.pages.OperatorPage;
import com.jbk.pages.UsefulLinksPage;
import com.jbk.utility.OperatorPageDataProvider;




public class OperatorPageTestCases extends BaseTest{

	WebDriver wd;
    OperatorPage op;
    Dashboardpage dp;
	LoginPageS lp;
	@BeforeMethod
	public void openBrowser() throws Exception {
		wd= initializedriver();
		op=lp.nevigeteToDashboard(wd).navigateToOperatorsPage();
		op=new OperatorPage(wd);
    }
	@Test(priority=1)
	public void verifyPageHeading() {
		
		Assert.assertTrue(op.isValidHeading());
	}
	@Test(priority=2)
	public void verifyTableHeaderCount() {
		
		Assert.assertTrue(op.isHeaderCountValid());
	}
	@Test(dataProviderClass=OperatorPageDataProvider.class,dataProvider="getHeaderData",priority=3)
	public void verifyTableHeader(String id, String person, String reason, String wayOfConnect, String contact,
			String timing) throws Exception {
		List<String> expHeader = new ArrayList<String>();
		expHeader.add(id);
		expHeader.add(person);
		expHeader.add(reason);
		expHeader.add(wayOfConnect);
		expHeader.add(contact);
		expHeader.add(timing);
		
		Assert.assertEquals(op.getTableHeaders(), expHeader);
	}
	@Test(priority=4)
	public void validateMobileNoSize() {
		
		Assert.assertTrue(op.isMobileNoSizeValid());
	}
	
	@Test(priority=5)
	public void verifyPageHeader() {
        
		Assert.assertTrue(op.isValidPageHeading());
	}
	@Test(priority=6)
	public void verifyTableHeading() {
		
		Assert.assertTrue(op.isValidTableHeading());
	}
	@Test(priority=7)
	public void validateTableHeader() throws Exception {
		
		Assert.assertTrue(op.isValidTableHeader());
	}
	@Test(priority=8)
	public void validateTableData() throws Exception {
		
		Assert.assertTrue(op.isValidTableData());
	}
	@Test(priority=9)
	public void validatePersonNames() throws Exception {
		
		Assert.assertTrue(op.isValidPersonNames());
	}
	@Test(priority=10)
	public void validateTableSize() throws Exception {
		
		Assert.assertTrue(op.isValidTableSize());
	}

	
	@AfterMethod
	public void closeBrowser() {
		wd.close();
	}
}


