package com.cyient.AppTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Soptify {

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "adityakale_I54pSt");
	      caps.setCapability("browserstack.key", "ysqtWk5eziMpS4EwmLyq");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://7340ee6f27cdf1857d5d466b1d981ffbd1d3a617");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "Spotify");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        

	      /* Write your Custom code here */
	        
	    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    	
	    	driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"CONTINUE WITH FACEBOOK\")").click();
	    	driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"Phone or Email\")").sendKeys("aditya.kale@gmail.com");
	    	driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"Password\")").sendKeys("Aditya1234");
	    	
	    	driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"LOG IN\")").click();
	    	
	    	
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();

	}

}
