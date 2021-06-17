package com.cyient.AppTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Zomato {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		 // Set your access credentials
	      caps.setCapability("browserstack.user", "adityakale_I54pSt");
	      caps.setCapability("browserstack.key", "ysqtWk5eziMpS4EwmLyq");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://85bcc68fffcb420f4a753e6923c712a3ab5e85ad");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "Zomato");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        

	      /* Write your Custom code here */
	        
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     // driver.findElement(By.xpath("//*[@text ='Continue with Email']")).click();
	        
	        driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"Continue with Email\")").click();
	        


	        
	        
	        
	        
	        
	        
	        
	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();
	    

	}

}
