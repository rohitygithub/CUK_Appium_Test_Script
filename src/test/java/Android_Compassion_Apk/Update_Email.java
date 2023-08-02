package Android_Compassion_Apk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Update_Email extends Base_Class {
	
	By burgermenu = By.id("imgBack");
	By profile = By.id("llProfile");
	By Email = By.id("textEmail");
	By clickemail = By.id("llEmail");
	By newemail = By.id("edtEmail");
	By confirmemail = By.id("edtConfirmEmail");
	By submitbtn = By.id("textSubmit");
	By valderror = By.id("textError");
	
	@Test
	public void change_email() {
		
       wait = new WebDriverWait(driver, Duration.ofSeconds(100));
       
		//Land on Home Page
		System.out.println("//***** Successfully user login and land on Home page ******//" + '\n');
		
		System.out.println("Scenario -" + '\n' +  "User test the functionality of the Email successsfully updated or not"+ '\n');
		
		//user click on Burger Menu
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgermenu));
		driver.findElement(burgermenu).click();
		
        System.out.println("//***** User is on Burger Menu ******//" + '\n');
		
		//user click on Profile option
		wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
		driver.findElement(profile).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
		String BeforeEmail = driver.findElement(Email).getText();
		System.out.println('\n'+"Before Email  "+BeforeEmail+'\n');
		
		String currentemail = "josoxa8948@glumark.com";
		String newEmail = "davidpaulwright@outlook.com.invalid";
		
		if(BeforeEmail.equals(currentemail)) {
		//user click on Email option
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickemail));
		driver.findElement(clickemail).click();
		
		//user click on New Email Address option
		wait.until(ExpectedConditions.visibilityOfElementLocated(newemail));
		driver.findElement(newemail).sendKeys(newEmail);
		
		//user click on Repeat New Email Address option
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmemail));
		driver.findElement(confirmemail).sendKeys(newEmail);
		
		
		}else {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickemail));
			driver.findElement(clickemail).click();
			
			//user click on New Email Address option
			wait.until(ExpectedConditions.visibilityOfElementLocated(newemail));
			driver.findElement(newemail).sendKeys(currentemail);
			
			//user click on Repeat New Email Address option
			wait.until(ExpectedConditions.visibilityOfElementLocated(confirmemail));
			driver.findElement(confirmemail).sendKeys(currentemail);
		}
		
		//user click on Submit button
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitbtn));
		driver.findElement(submitbtn).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
		String AfterEmail = driver.findElement(Email).getText();
		System.out.println('\n'+"After Email  "+AfterEmail+'\n');
		
		
			if(BeforeEmail.equalsIgnoreCase(AfterEmail)) {
				System.out.println("Email is not updated...... Test case failed ");
			
		}else {
			
			System.out.println("Email is updated successfully - Test Case Passed");
			
		}
		 
		}
		
		
	}


