package Android_Compassion_Apk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Postal_Address extends Base_Class {
	
	By burgermenu = By.id("imgBack");
	By profile = By.id("llProfile");
	By postalAdd = By.id("llAddress");
	By edit = By.xpath("//*[contains(@text,'Edit')]");
	By entercode = By.id("edtSearch");
	By finfAddress = By.id("textFind");
	By dropdown = By.id("txtName");
	By dropvalue = By.id("txtName");
	By submit = By.xpath("//*[contains(@text, 'Submit changes')]");
	
	@Test
	public void postal_Add() throws InterruptedException {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		//Land on Home Page
		System.out.println("//***** Successfully user login and land on Home page ******//" + '\n');
		
		//user click on Burger Menu
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgermenu));
		driver.findElement(burgermenu).click();
		
        System.out.println("//***** User is on Burger Menu ******//" + '\n');
		
		//user click on Profile option
		wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
		driver.findElement(profile).click();
		
		System.out.println("//***** User is on Postal Address ******//" + '\n');
		
		//user click on Postal Address option
		wait.until(ExpectedConditions.visibilityOfElementLocated(postalAdd));
		driver.findElement(postalAdd).click();
		
		//user click on Edit option
		wait.until(ExpectedConditions.visibilityOfElementLocated(edit));
		driver.findElement(edit).click();
		
		//user Enter code
		wait.until(ExpectedConditions.visibilityOfElementLocated(entercode));
		driver.findElement(entercode).sendKeys("KT19 0DT");
		
		//user click on Find My Address button
		wait.until(ExpectedConditions.visibilityOfElementLocated(finfAddress));
		driver.findElement(finfAddress).click();
		
		//user click on dropdown option
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
		driver.findElement(dropdown).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropvalue));
		WebElement dropdown = driver.findElements(dropvalue).get(1);
		System.out.println(dropdown);
		Thread.sleep(2000);
		dropdown.click();
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + 
		".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Submit changes" + "\").instance(0))"));
		
		//user click on submit button
		wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
		driver.findElement(submit).click();
		
	}

}
