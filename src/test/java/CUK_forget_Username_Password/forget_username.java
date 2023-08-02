package CUK_forget_Username_Password;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class forget_username extends BaseClass {
	
	By forgetusername = By.id("textForgotUsername");
	By editemail = By.id("edtEmail");
	By submitbtn = By.id("textSubmit");
	
	@Test
	public void Forget_Username() {
	
		wait = new WebDriverWait(driver, Duration.ofSeconds(70));
		
		
		
		//user click on Forget Username option
		wait.until(ExpectedConditions.visibilityOfElementLocated(forgetusername));
		driver.findElement(forgetusername).click();
		
		//user enter email
		wait.until(ExpectedConditions.visibilityOfElementLocated(editemail));
		driver.findElement(editemail).sendKeys("");
		
		//user click on Submit button
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitbtn));
		driver.findElement(submitbtn).click();
	}
	
	

}
