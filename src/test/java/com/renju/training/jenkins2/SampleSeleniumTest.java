package com.renju.training.jenkins2;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleSeleniumTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
	}

	@Test
	public void test() throws Exception{
		//driver.get("https://www.geeksforgeeks.org/");

		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		Assert.assertTrue(true);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
