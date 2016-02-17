package com.snw.automation.pageobjects.ios;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePagePO {
	private RemoteWebDriver driver;

	public HomePagePO(RemoteWebDriver remoteWebDriver)
	{
		driver = (AppiumDriver<?>) remoteWebDriver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
