package week5day1;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Baseclass {

	
		public ChromeDriver driver;
		  @BeforeMethod
		  public void beforeMethod() {
		  	WebDriverManager.chromedriver().setup();
		  	driver = new ChromeDriver();
		  	driver.get("http://leaftaps.com/opentaps/control/main");
		  	driver.manage().window().maximize();
		  	WebElement elementUsername = driver.findElement(By.id("username"));
		  	elementUsername.sendKeys("Demosalesmanager");
		  	WebElement elementPassword = driver.findElement(By.id("password"));
		  	elementPassword.sendKeys("crmsfa");
		  	driver.findElement(By.className("decorativeSubmit")).click();
		  	driver.findElement(By.className("crmsfa")).click();	
		  }


		  @AfterMethod
		  public void afterMethod() {
		  	 driver.close();
		  }
	}


