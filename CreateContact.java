package week5day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class CreateContact extends Baseclass {
	@Test
	public void createContact () {
	driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Create Contact")).click();
	WebElement elementFirstname=driver.findElement(By.id("firstNameField"));
	elementFirstname.sendKeys("riya");
	driver.findElement(By.id("lastNameField")).sendKeys("s");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("");
	driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("fresher");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("rinusumi0905@gmail.com");
	WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select obj = new Select(state);
	obj.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("description")).clear();
    driver.findElement(By.id("createContactForm_importantNote")).sendKeys("officeUseOnly");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	String title = driver.getTitle();
	System.out.println(" page title is : " + title);
    driver.close();
}
}
