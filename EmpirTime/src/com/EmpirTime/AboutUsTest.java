package com.EmpirTime;


import org.junit.Test;
import org.openqa.selenium.By;

import com.base.BaseClass;



public class AboutUsTest extends BaseClass {
	//WebDriver Driver = new FirefoxDriver();
	@Test
	public void testAboutUs () {
	Driver.findElement(By.linkText("About Us")).click();
	}

}