package com.cyient.AppTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Udictonary {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "adityakale_1Vb8tT");
		caps.setCapability("browserstack.key", "WoKf1k4iJy9ipBE5swHp");

		// Set URL of the application under test
		caps.setCapability("app", "bs://f1a8d1343d3098f5be5e64e5905c63e4ac6ce865");

		// Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "first_test");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);

		/* Write your Custom code here */
		
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Next\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Next\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Start\")").click();
		
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"DONE\")").click();
		
		driver.findElementById("com.youdao.hindict:id/ivClose").click();
		
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'Writing Club')]").size()==0) {
			Map<String, String> map = new HashMap <String,String> ();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
			
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Writing Club\")").click();
		
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Join\")").click();
		
		
		
		
		
		
		

		// Invoke driver.quit() after the test is done to indicate that the test is
		// completed.
		driver.quit();

	}

}
