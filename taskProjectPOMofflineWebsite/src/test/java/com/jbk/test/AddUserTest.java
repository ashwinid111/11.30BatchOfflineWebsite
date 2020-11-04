package com.jbk.test;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.pages.AddUser;
import com.jbk.pages.LoginPage_AddUser;
import com.jbk.testBase.TestBase;

public class AddUserTest extends TestBase {
	WebDriver driver = null;
	LoginPage_AddUser lp;
	AddUser rp;
	private static Logger logger = Logger.getLogger(AddUserTest.class);

	@BeforeClass
	public void openBrowser() {
		/*
		 * TestBase b= new TestBase(); b.loggerTest();
		 */
	//	logger.info("========================================================");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///G:/Tushar/Software/Offline%20Website%20FULL/Offline%20Website/Offline%20Website/index.html");
		lp = new LoginPage_AddUser(driver);
		rp = new com.jbk.pages.AddUser(driver);

		logger.info("Done with one test case");
		//logger.info("========================================================");
	}

	@AfterClass
	public void browserClose() {
		driver.close();
	}

	// all URL Check
	@Test(priority = 1)
	public void allUrl() throws Exception {

		lp.loginData();
		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///G:/Tushar/Software/Offline%20Website%20FULL/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		// System.out.println(driver.getCurrentUrl());

	}

	@Test(priority = 2)
	public void userClick() throws Exception {
		rp.userPage();
		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///G:/Tushar/Software/Offline%20Website%20FULL/Offline%20Website/Offline%20Website/pages/examples/users.html");

	}

	@Test(priority = 3)
	public void addUserClick() throws Exception {
		rp.addUserPage();
		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///G:/Tushar/Software/Offline%20Website%20FULL/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
		// System.out.println(driver.getCurrentUrl());
	}
	// all Lable check

	@Test(priority = 4)
	public void addUserTextCheck() throws Exception {
		String addUserText = rp.addUserTextCheck();
		Assert.assertEquals(addUserText, "Add User");
	}

	@Test(priority = 5)
	public void userNameLableCheck() throws Exception {
		String unameLable = rp.usernameLableCheck();
		Assert.assertEquals(unameLable, "Username");
		logger.info("logger Username check.......");
	}

	@Test(priority = 6)
	public void mobileLable() throws Exception {
		String mobileLable = rp.mobileLableCheck();
		Assert.assertEquals(mobileLable, "Mobile");
	}

	@Test(priority = 7)
	public void emailLable() throws Exception {
		String emailLable = rp.emailLableCheck();
		Assert.assertEquals(emailLable, "Email");
	}

	@Test(priority = 8)
	public void courseLable() throws Exception {
		String courseLable = rp.courseLableCheck();
		Assert.assertEquals(courseLable, "Courses");
	}

	@Test(priority = 9)
	public void genderLable() throws Exception {
		String genderLable = rp.genderLableCheck();
		Assert.assertEquals(genderLable, "Gender");
	}

	@Test(priority = 10)
	public void stateLable() throws Exception {
		String stateLable = rp.stateLableCheck();
		Assert.assertEquals(stateLable, "State");
	}

	@Test(priority = 11)
	public void passwordLable() throws Exception {
		String passwordLable = rp.passLableCheck();
		Assert.assertEquals(passwordLable, "Password");
	}

	// all Placeholder check
	@Test(priority = 12)
	public void userNamePlaceCheck() throws Exception {
		String unamePalce = rp.getPlcaeholderUserName();
		Assert.assertEquals(unamePalce, "Username");
	}

	@Test(priority = 13)
	public void mobilePlaceCheck() throws Exception {
		String mobilePalce = rp.getPlcaeholderMobile();
		Assert.assertEquals(mobilePalce, "Mobile");
	}

	@Test(priority = 14)
	public void emailPlaceCheck() throws Exception {
		String emailPalce = rp.getPlcaeholderEmail();
		Assert.assertEquals(emailPalce, "Email");
	}

	@Test(priority = 15)
	public void coursesPlaceCheck() throws Exception {
		String coursesPalce = rp.getPlcaeholderCourses();
		Assert.assertEquals(coursesPalce, "Java/J2EE");
	}

	@Test(priority = 16)
	public void passwordPlaceCheck() throws Exception {
		String passwordata = rp.getPlcaeholderPassword();
		Assert.assertEquals(passwordata, "Password");
	}
	/*
	 * @Test(priority = 17) public void genderChk() throws Exception { String
	 * gender = rp.genderCheck(); Assert.assertEquals(gender, "Gender"); }
	 */
}
