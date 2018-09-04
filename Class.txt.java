package com.package12.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CLass {
@Test
public void opengmail() {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://gmail.com");
	
	System.out.println(driver.getTitle());
	driver.close();
	driver.quit();
}
}
