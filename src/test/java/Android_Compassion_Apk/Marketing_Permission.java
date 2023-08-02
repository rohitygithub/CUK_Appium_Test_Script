package Android_Compassion_Apk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Marketing_Permission extends Base_Class {
	
	By burgermenu = By.id("imgBack");
	By profile = By.id("llProfile");
	By Mpermission = By.id("llMarketing");
	By Email  = By.id("swtEmail");
	By PEmail = By.id("swtPrayer");
	By Letter = By.id("swtNewsletter");
	By Comns =By.id("swtCommunication");
	
	@Test
	public void MarketingPermission() {
		
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
		
		System.out.println("//***** User is on Marketing Permission ******//" + '\n');
		
		
		//user click on Marketing Permission option
		wait.until(ExpectedConditions.visibilityOfElementLocated(Mpermission));
		driver.findElement(Mpermission).click();
		
		System.out.println("Email Switch option is already on");
		
		boolean email =driver.findElement(PEmail).isDisplayed();
		boolean letter =driver.findElement(Letter).isDisplayed();
		boolean comns =driver.findElement(Comns).isDisplayed();
		
		if(email || letter || comns ) {
			
			System.out.println("Successfully Test is Passed");
		}
		
		
		
	}

}
