package com.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass  {
	public WebDriver Driver = new FirefoxDriver();

	@Before
	public void openBrowser() {
		Driver.get("http://empiretimeny.com/index.php/sdsdsd.html");

	}
	

	@After
	public void closeBrowser() {
		Driver.close();

	}

}
