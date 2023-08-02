package Android_Compassion_Apk;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Sponsorship_Prefrence extends Base_Class {
	
	By burgermenu = By.id("imgBack");
	By profile = By.id("llProfile");
	By sponsorpref = By.xpath("//*[contains(@text, 'Sponsorship Preferences')]");
	By gopaperless = By.id("llPaperless");
	By Switch = By.id("textPaperLabel");
	By reasontext = By.id("edtReason");
	By submit = By.id("textSubmit");
	
	@Test
	public void Login() throws InterruptedException {
		//Land on Home Page
		System.out.println("//***** Successfully user login and land on Home page ******//" + '\n');
		
		//user click on Burger Menu
		wait.until(ExpectedConditions.visibilityOfElementLocated(burgermenu));
		driver.findElement(burgermenu).click();
		
		System.out.println("//***** User is on Burger Menu ******//" + '\n');
		
		//user click on Profile option
		wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
		driver.findElement(profile).click();
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + 
		".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Sponsorship Preferences" + "\").instance(0))"));
		
		//user click on Sponsorship Preference option
		wait.until(ExpectedConditions.visibilityOfElementLocated(sponsorpref));
		driver.findElement(sponsorpref).click();
		
		System.out.println("//***** User is in Sponsorship Prefrence ******//" + '\n');
		
		//user click on Go Paperless option
		wait.until(ExpectedConditions.visibilityOfElementLocated(gopaperless));
		driver.findElement(gopaperless).click();
		
		boolean soff = driver.findElement(By.xpath("(//*[contains(@text, 'Sign-up to receive all communications from Compassion UK digitally.')])[2]")).isDisplayed();
		String off = driver.findElement(By.xpath("(//*[contains(@text, 'Sign-up to receive all communications from Compassion UK digitally.')])[2]")).getText();
		
		if(soff) {
			
			System.out.println("Switch is off" +'\n'+ off + '\n');
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(Switch));
			driver.findElement(Switch).click();
			Thread.sleep(10000);
			}
		else {
				System.out.println("Switch is already on" + '\n');
				wait.until(ExpectedConditions.visibilityOfElementLocated(Switch));
				driver.findElement(Switch).click();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(reasontext));
				driver.findElement(reasontext).sendKeys("Test");
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(submit));
				driver.findElement(submit).click();
				
				Thread.sleep(4000);
				
			}
			
			}
		
		}


