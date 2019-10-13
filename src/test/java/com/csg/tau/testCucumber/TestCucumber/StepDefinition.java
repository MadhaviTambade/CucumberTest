package com.csg.tau.testCucumber.TestCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class StepDefinition {

	WebDriver driver;
	
	@Given("^user navigates to \"([^\"])\"$")

	public void user_navigates_to_google(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aaru\\DemoSelenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
}