package week5day1;

import org.junit.Test;
import org.openqa.selenium.By;

public class Duplicate extends Baseclass {
	@Test
	public void duplicate() {
	driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.xpath("//span[text()='Email']")).click();
    driver.findElement(By.name("emailAddress")).sendKeys("ssss143@gmail.com");
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
 
    driver.findElement(By.xpath("(//a[@ href='/crmsfa/control/viewLead?partyId=10119'])")).click();
    driver.findElement(By.className("subMenuButton")).click();
    driver.findElement(By.linkText("Duplicate Lead")).click();
    driver.findElement(By.name("submitButton")).click();
    driver.close();
}
}
