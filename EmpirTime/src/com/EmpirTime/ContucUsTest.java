package com.EmpirTime;

import org.junit.Test;
import org.openqa.selenium.By;

import com.base.BaseClass;

public class ContucUsTest extends BaseClass{

	//WebDriver Driver = new FirefoxDriver();

	@Test
	public void testEmpirTime() {
		Driver.findElement(By.linkText("Contact Us")).click();

	}

}
