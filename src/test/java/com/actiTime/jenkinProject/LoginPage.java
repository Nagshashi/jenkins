package com.actiTime.jenkinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage 
{
@Test
public static void openApp() 
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=2n9ql506o83jt");
	System.out.println(driver.getTitle());
	driver.close();
}
}
