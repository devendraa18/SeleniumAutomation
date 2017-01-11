package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import com.browserutility.BrowserUtility;
import com.constants.Constants;

public class WordPressLogin implements IReporter{
	
	WebDriver driver = null;
	BrowserUtility bro = new BrowserUtility();
	Constants cont = new Constants();

	@Parameters({"browser"})
	@BeforeTest
	public void launchBrowser(String browser){
		driver = bro.launchBrowser(browser);
	}
	
	@Parameters({"username", "password"})
	@Test(enabled=true)
	public void wordPressLogin(String username, String password){
		driver.get("https://login.wordpress.org/");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.linkText("Log Out")).click();
	}
	
	@AfterTest
	public void tearDown(){
		//driver.close();
		driver.quit();
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

	
		
	}

}
