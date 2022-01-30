package com.main;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

//@Listeners(com.main.ListenersClass.class)
public class FirstClassMaven {

	@Test
	public void testMaven1() throws InterruptedException {
//		WebDriver Driver = new ChromeDriver();
//		Driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		System.out.println("++++++ " + System.getProperty("env.BROWSER"));
//		if(System.getProperty("env.BROWSER").equalsIgnoreCase("chrome")) {
//			Driver = new ChromeDriver();
//		}
//		else if(System.getProperty("env.BROWSER").equalsIgnoreCase("firefox")) {
//			Driver = new FirefoxDriver();
//		}
//		Thread.sleep(2000);
//		Driver.quit();
		System.out.println("HAHAH");
	}
	@Test
	public void tm2() {
		System.out.println("Hey");
//		Assert.fail();
	}
	@Test(dependsOnMethods="tm2")
	public void tm3() {
		System.out.println("Lol");
	}
}
