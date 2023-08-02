package Android_Compassion_Apk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class update_Phone_No extends Base_Class {
	
	By burgermenu = By.id("imgBack");
	By profile = By.id("llProfile");
	By phoneNo = By.id("textPhone");
	By ClickPhone = By.id("llPhone");
	By editPhoneNo = By.id("edtPhone");
	By SubmitBtn = By.id("textSubmit");
	@Test
	public void change_phone_no() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	       
		//Land on Home Page
		System.out.println("//***** Successfully user login and land on Home page ******//" + '\n');
		
		System.out.println("Scenario -" + '\n' + '\n'+ "User test the functionality of the phone no. successsfully updated or not"+ '\n');
		
		//user click on Burger Menu
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgermenu));
		driver.findElement(burgermenu).click();
		
        System.out.println("//***** User is on Burger Menu ******//" + '\n');
		
		//user click on Profile option
		wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
		driver.findElement(profile).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNo));
		String Beforephone = driver.findElement(phoneNo).getText();
		System.out.println('\n'+"Before Phone No. -- "+Beforephone+'\n');
		
		String currentPhoneNo = "1235677890";
		String newPhoneNo = "7898546258";
		
		if(Beforephone.equals(currentPhoneNo)) {
			
			//user click on Phone No option
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickPhone));
			driver.findElement(ClickPhone).click();
			
			//user click on Phone no text field
			wait.until(ExpectedConditions.visibilityOfElementLocated(editPhoneNo));
			driver.findElement(editPhoneNo).sendKeys(newPhoneNo);
			
			}else {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickPhone));
			driver.findElement(ClickPhone).click();
			
			//user click on New Email Address option
			wait.until(ExpectedConditions.visibilityOfElementLocated(editPhoneNo));
			driver.findElement(editPhoneNo).sendKeys(currentPhoneNo);
		}
		
		// user click on Submit button
		wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitBtn));
		driver.findElement(SubmitBtn).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNo));
		String AfterPhoneNo = driver.findElement(phoneNo).getText();
		System.out.println('\n'+"After Phone No. -- "+AfterPhoneNo+'\n');
		
		
			if(Beforephone.equalsIgnoreCase(AfterPhoneNo)) {
				System.out.println("Phone NO. is not updated...... Test case failed ");
			
		}else {
			
			System.out.println("Phone NO. is updated successfully - Test Case Passed");
			
		}
		
		
		
	}

}
