package Ltdemo;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.HashMap;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LtExample {

		@Test
		
	   public static void loginTest() throws MalformedURLException, InterruptedException {
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName("Windows 10");
			browserOptions.setBrowserVersion("122.0");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "yashtandon335");
			ltOptions.put("accessKey", "I7bWy0gsUKlREdLK2pd3fsrn8nZ433jjtHy46XfQ358F1tuYhN");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("build", "SeleniumBuild");
			ltOptions.put("project", "TestingTwo");
			ltOptions.put("name", "LamdatestTwo");
			ltOptions.put("selenium_version", "4.0.0");
			ltOptions.put("w3c", true);
			browserOptions.setCapability("LT:Options", ltOptions);
			
			// Test Case 1 - When User-Name and Password is Correct.
			final WebDriver driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.name("password")).sendKeys("Password123");
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			
            Assert.assertTrue(driver.getTitle().contains("Automation"));
            Thread.sleep(3000);
            // Test Case 2 - When user name is incorrect but password is correct.
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.findElement(By.id("username")).sendKeys("student0");
			driver.findElement(By.name("password")).sendKeys("Password123");
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			Assert.assertTrue(driver.getTitle().contains("Automation"));
			Thread.sleep(3000);
			
			//  Test Case 3 When both id and password are incorrect.
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.name("password")).sendKeys("Password0120");
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			Assert.assertTrue(driver.getTitle().contains("Automation"));
			Thread.sleep(3000);
			
			
			
			//Parallel Checking of Different websites at the same time.
			//Test Case 4 -  In this when username and password is correct.
			driver.get("https://practice.expandtesting.com/secure/");
			driver.findElement(By.id("username")).sendKeys("practice");
			driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
			driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
			
            Assert.assertTrue(driver.getTitle().contains("Automation"));
			//driver.quit();
			Thread.sleep(5);
			// Test Case 5 - When both are incorrect.
			driver.get("https://practice.expandtesting.com/secure/");
			driver.findElement(By.id("username")).sendKeys("practice1");
			driver.findElement(By.name("password")).sendKeys("superSecretPassword");
			driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
			
            Assert.assertTrue(driver.getTitle().contains("Automation"));
			Thread.sleep(5000);
			// Test Case - 6 - When Both id and password is correct
			driver.get("https://practice.expandtesting.com/secure/");
			driver.findElement(By.id("username")).sendKeys("practice");
			driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
			driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
			Assert.assertTrue(driver.getTitle().contains("Automation"));
			Thread.sleep(5000);
			
			
			driver.quit();
			
			
		
			
			
			
		}
		@Test
	   // Test Case 7 - Same site on Different Browser.
		
		   public static void loginTest1() throws MalformedURLException, InterruptedException {
				EdgeOptions browserOptions = new EdgeOptions();
				browserOptions.setPlatformName("Windows 10");
				browserOptions.setBrowserVersion("122.0");
				HashMap<String, Object> ltOptions = new HashMap<String, Object>();
				ltOptions.put("username", "yashtandon335");
				ltOptions.put("accessKey", "I7bWy0gsUKlREdLK2pd3fsrn8nZ433jjtHy46XfQ358F1tuYhN");
				ltOptions.put("visual", true);
				ltOptions.put("video", true);
				ltOptions.put("build", "SeleniumBuild1");
				ltOptions.put("project", "TestingTwo1");
				ltOptions.put("name", "LamdatestTwo");
				ltOptions.put("selenium_version", "4.0.0");
				ltOptions.put("w3c", true);
				browserOptions.setCapability("LT:Options", ltOptions);
				
				
				final WebDriver driver = new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
				driver.get("https://practice.expandtesting.com/secure/");
				driver.findElement(By.id("username")).sendKeys("practice");
				driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
				driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
				
	            Assert.assertTrue(driver.getTitle().contains("Automation"));
				driver.quit();
			}
}
//		public static void main(String args[]) throws MalformedURLException {
//			loginTest();
//		}

	


