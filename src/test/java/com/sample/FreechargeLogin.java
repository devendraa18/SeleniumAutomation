package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.browserutility.BrowserUtility;
import com.constants.Constants;


public class FreechargeLogin implements ITestListener{
	WebDriver driver = null;
	BrowserUtility bro = new BrowserUtility();
	Constants cont = new Constants();

	@Parameters({"browser"})
	@BeforeTest
	public void launchBrowser(String browser){
		driver = bro.launchBrowser(browser);
	}
	
	/*@Test(enabled=true)
	public void loginToFreecharge()  {
		driver.get("https://freecharge.com");
		//bro.waitForElement(driver);
		//bro.waitForPageLoad(driver);
		driver.findElement(By.xpath("//a[contains(text(),'Login/Register')]")).click();
		//bro.waitForElement(driver);
		driver.findElement(By.id("userName")).sendKeys(cont.username);
		driver.findElement(By.id("password")).sendKeys(cont.password);
		driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
		//bro.waitForElement(driver);
		driver.findElement(By.xpath("//img[@src='/desktop/images/fc_user_image.png']")).click();
		//bro.waitForElement(driver);
		driver.findElement(By.xpath("//ul[contains(@class, '_2gKWt')]/li[6]/a")).click();
		
		
	}*/
	
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
	public void onTestStart(ITestResult result) {
		System.out.println("Test case has started..!!!"+result.toString());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case has passed..!!!"+result.toString());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case has failed..!!!"+result.toString());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test execution has been started..!!!!");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
