package CUK_forget_Username_Password;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	public static AndroidDriver driver;
	public static WebDriverWait wait;
	public static URL url;
	
	By byyesbutton = By.id("llTellMoreYes");
	By byesbutton2 = By.id("llYesWebsite");
	By byLogin    = By.id("llLogin");
	
	
	@BeforeMethod
	public void setupApplication() throws MalformedURLException {
		
Reporter.log("************************ Android Session Started ************************", true);
    	
    	DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("deviceName","Android Emulator");
		dc.setCapability("app","C:\\Users\\ABC\\Downloads\\app-dev-debug.apk");
		 
		 
		
		URL url=new URL("http://localhost:4723/wd/hub");
	    driver = new AndroidDriver(url,dc);
	    
	    boolean isnotAppInstalled = driver != null? driver.isAppInstalled("com.geecon.compassionuk_dev"):false;
	    System.out.println("Compassion App is Already Installed - " + isnotAppInstalled);
	    
	    if(isnotAppInstalled = false) {
	    
		 wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	    	
	    System.out.println("/********* Installation started of Compassion Apk file ********/" +'\n');

		wait.until(ExpectedConditions.visibilityOfElementLocated(byyesbutton));
		driver.findElement(byyesbutton).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byesbutton2));
		driver.findElement(byesbutton2).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLogin));
		driver.findElement(byLogin).click();
		
		System.out.println("/********* Successfully Installed Compassion Apk file *********/" + '\n');
		
		
		
	} else{
    	
    	wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    	driver.startActivity(new Activity("com.geecon.compassionuk_dev",
		    	"com.geecon.compassionuk.activity.MainActivity"));
    	
    	
    		try {
    			Thread.sleep(2000);
    			driver.startActivity(new Activity("com.geecon.compassionuk_dev",
    			    	"com.geecon.compassionuk.activity.MainActivity"));
    			
    			
    			System.out.println("Compassion Apk is not Logged-in");
    			Thread.sleep(2000);
    			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/llData1"))); 
    			boolean Lg = driver.findElement(By.id("com.geecon.compassionuk_dev:id/llData1")).isDisplayed();
    			Thread.sleep(2000);
	    		String LG = driver.findElement(By.id("com.geecon.compassionuk_dev:id/llImage1")).getText();
	    		System.out.println('\n' + '\n' + LG + '\n');
    			
    			if(Lg) {
    			//Login button
    			Thread.sleep(2000);	
    			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/llData1")));
    			driver.findElement(By.id("com.geecon.compassionuk_dev:id/llData1")).click();
    			}
    		}catch(Exception E) {
    			E.printStackTrace();
    		}
	}

}
	@AfterMethod
	public void closeApplication() {
		
		Reporter.log("************************ Android Session End ************************", true);
		driver.quit();
		
	}
	
}
