package week5day1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class CreateLead extends Baseclass {
	@Test
	public void createLead () {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sumithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("9/5/1997");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("ari");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vaishu");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("27,kamaraj salai");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("sree nagar nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tennessee");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600062");
		driver.findElement(By.name("submitButton")).click();
	}}
		

