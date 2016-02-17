package com.snw.automation.test.ios;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.snw.automation.pageobjects.ios.LoginPO;
import com.snw.automation.test.BaseTest;

/**
 * Unit test for simple App.
 */
public class Logintest extends BaseTest
    { 
	
	
	public Logintest() throws MalformedURLException {
		super("IOS");
		// TODO Auto-generated constructor stub
	}





	LoginPO loginPO = new LoginPO(driver);
	

	


 @Test
 public void testValidEmailAddress() throws InterruptedException
 {
	 loginPO.enterLoginDetails("walia.jaspreet@gmail.com","password");
	 
 }
 
 
}
