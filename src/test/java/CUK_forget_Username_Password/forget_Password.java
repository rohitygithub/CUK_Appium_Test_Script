package CUK_forget_Username_Password;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class forget_Password extends BaseClass {
	
	By forgetpass = By.id("textForgotPassword");
	By editusername = By.id("edtUsername");
	By submitbtn = By.id("textSubmit");
	
	@Test
	public void Forget_Password() {
		
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		//user click on Forget Password option
		wait.until(ExpectedConditions.visibilityOfElementLocated(forgetpass));
		driver.findElement(forgetpass).click();
		
		//user enter email
		wait.until(ExpectedConditions.visibilityOfElementLocated(editusername));
		driver.findElement(editusername).sendKeys("");
		
		//user click on Submit button
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitbtn));
		driver.findElement(submitbtn).click();
	}

}
