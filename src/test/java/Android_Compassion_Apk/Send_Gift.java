package Android_Compassion_Apk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Send_Gift extends Base_Class {
	
	By gift = By.id("navi_gift");
	By addamount = By.id("imgAdd");
	By amountvalue = By.id("edtValue");
	By confirmbtn = By.id("textConfirm");
	By nextbtn = By.id("textNext");
	By nextbtn2 = By.id("textContactUs");
	By checkbox = By.id("chkRemember");
	By agreebtn = By.id("textAgree");
	By debitbtn = By.id("textGive");
	By HubBtn = By.id("llHub");
	
	@Test
	public void Gifts() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		
		//Land on Home Page
		System.out.println("//***** Successfully user login and land on Home page ******//" + '\n');
				
		//user click on Gift option
		wait.until(ExpectedConditions.visibilityOfElementLocated(gift));
		driver.findElement(gift).click();
		
		//user click on Add Amount option
		wait.until(ExpectedConditions.visibilityOfElementLocated(addamount));
		driver.findElement(addamount).click();
		
		//user enter Amount 
		wait.until(ExpectedConditions.visibilityOfElementLocated(amountvalue));
		driver.findElement(amountvalue).sendKeys("25");
		
		//user click on Confirm button
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmbtn));
		driver.findElement(confirmbtn).click();
		
		//user click on Next button
		wait.until(ExpectedConditions.visibilityOfElementLocated(nextbtn));
		driver.findElement(nextbtn).click();
		
		//user click on Next2 button
		wait.until(ExpectedConditions.visibilityOfElementLocated(nextbtn2));
		driver.findElement(nextbtn2).click();
		
		//user tick mark on checkbox
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox));
		driver.findElement(checkbox).click();
		
		//user Click on Agree and Continue button
		wait.until(ExpectedConditions.visibilityOfElementLocated(agreebtn));
		driver.findElement(agreebtn).click();
		
		//user click on Direct Debit button button
		wait.until(ExpectedConditions.visibilityOfElementLocated(debitbtn));
		driver.findElement(debitbtn).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textLabel"))); 
		boolean Message = driver.findElement(By.id("textLabel")).isDisplayed();
		String mesgText = driver.findElement(By.id("textLabel")).getText();
		
		
		if(Message) {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(HubBtn));
			driver.findElement(HubBtn).click();
			
			System.out.println("Successfully Gift Send & Displayed Thank You Page" + '\n' + mesgText + '\n');
		}
		
		else {
			
			System.out.println("The Gif was not sent successfuly & the Thank You Page does not Appear");
		}
		
	}

}
