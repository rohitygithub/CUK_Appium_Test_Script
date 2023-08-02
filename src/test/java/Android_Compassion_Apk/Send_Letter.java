package Android_Compassion_Apk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Send_Letter extends Base_Class {
	
	By Letter = By.id("navi_write");
	By Note = By.xpath("//*[contains(@text,'Short Note')]");
	By Text = By.id("edtContent");
	By previewbtn = By.id("textNext");
	By sendbtn = By.id("textSend");
	By message = By.xpath("//*[contains(@text,'Your message is on its way')]");
	By HubBtn = By.id("llHub");
	
	
	@Test
	public void letter() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		
		//Land on Home Page
		System.out.println("//***** Successfully user login and land on Home page ******//" + '\n');
		
		//user click on Letter option
		wait.until(ExpectedConditions.visibilityOfElementLocated(Letter));
		driver.findElement(Letter).click();
		
		//user click on short note option
		wait.until(ExpectedConditions.visibilityOfElementLocated(Note));
		driver.findElement(Note).click();
		
		//user enter letter content
		wait.until(ExpectedConditions.visibilityOfElementLocated(Text));
		driver.findElement(Text).sendKeys("Test");
		
		//user click on Preview button
		wait.until(ExpectedConditions.visibilityOfElementLocated(previewbtn));
		driver.findElement(previewbtn).click();
		
		//user click on Send button
		wait.until(ExpectedConditions.visibilityOfElementLocated(sendbtn));
		driver.findElement(sendbtn).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'Your message is on its way')]"))); 
		boolean Message = driver.findElement(By.xpath("//*[contains(@text,'Your message is on its way')]")).isDisplayed();
		String mesgText = driver.findElement(By.xpath("//*[contains(@text,'Your message is on its way')]")).getText();
		
		
		if(Message) {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(HubBtn));
			driver.findElement(HubBtn).click();
			
			System.out.println("Successfully letter Send & Displayed Thank You Page" + '\n' + mesgText + '\n');
		}
		
		else {
			
			System.out.println("The letter was not sent successfuly & the Thank You Page does not Appear");
		}
	}

}
