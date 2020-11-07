package com.jbk.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPageS;



public class LoginPageTest {
	public WebDriver driver;
    public	LoginPageS lp=null;
@BeforeMethod
public void loadurl()
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/User/Desktop/JBK%20Documents/Offline%20website/Offline%20website/index.html");
	driver.manage().window().maximize();
	lp=new LoginPageS(driver);
}
@AfterMethod

public void closeDriver(){
   driver.close();
   }

	
	@Test(priority=1)
	public void validateLogo(){
		
		Assert.assertTrue(lp.verifyLogo(driver));
		
	}
   @Test(priority=2)
   public void validateJbkText() {
	   
	   Assert.assertTrue(lp.verifyJbkText(driver));
   }
   @Test(priority=3)
   public void validateJavaText() {
	   
	   Assert.assertTrue(lp.verifyJavaText(driver));
   }
   @Test(priority=4)
   public void validateSignInText() {
	   
	   
	   
	   Assert.assertTrue(lp.verifysigiintext(driver));
   }
   @Test(priority=5)
   public void validatePlHolder() {
	   
	   Assert.assertTrue(lp.verifyPlHolder(driver));
   }
   @Test(priority=6)
   public void validatePlHolder1() {
	   
	   Assert.assertTrue(lp.verifyPlHolder1(driver));
   }
   @Test(priority=7)
   public void validateLoginCred() {	   
	   Assert.assertTrue(lp.loginCred(driver));
   }
   @Test(priority=7)
   public void validateLogoutmsg() {	   
	   Assert.assertTrue(lp.dashboardLogout(driver));
   }
   @Test(priority=8)
   public void validateEmailErrorMsg() {
	   
	   Assert.assertTrue(lp.errorMsg(driver));
   }
   @Test(priority=9)
   public void validatePassErrorMsg() {
	   
	   Assert.assertTrue(lp.errorMsg1(driver));
   }
   @Test(priority=10)
   public void validateErrorMsgWithoutEmail() {
	   
	   Assert.assertTrue(lp.errorMsgwithoutemail(driver));
   }
   @Test(priority=11)
   public void validateErrorMsgWithoutPassword() {
	   
	   Assert.assertTrue(lp.errorMsgwithoutpassword(driver));
   }
   @Test(priority=12)
   public void validateNewRegLink() {
	   
	   Assert.assertTrue(lp.newRegLink(driver));
   }
}
   
 
