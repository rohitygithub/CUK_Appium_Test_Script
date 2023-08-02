package Compassion_Apk;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Installing_Apk {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
      DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability("platformName","Android");
		dc.setCapability("deviceName","Android Emulator");
		dc.setCapability("app","C:\\Users\\ABC\\Downloads\\app-dev-debug.apk");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		System.out.println("Installation started of Compassion Apk file" + '\n');

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/llTellMoreYes")));
		driver.findElement(By.id("com.geecon.compassionuk_dev:id/llTellMoreYes")).click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/llYesWebsite")));
		driver.findElement(By.id("com.geecon.compassionuk_dev:id/llYesWebsite")).click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/llLogin")));
		driver.findElement(By.id("com.geecon.compassionuk_dev:id/llLogin")).click();
		Thread.sleep(2000);
		
		System.out.println("Successfully Installed Compassion Apk file" + '\n');
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/edtUsername")));
		WebElement user = driver.findElement(By.id("com.geecon.compassionuk_dev:id/edtUsername"));
		user.sendKeys("davewright79");
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/edtPassword")));
		WebElement pass = driver.findElement(By.id("com.geecon.compassionuk_dev:id/edtPassword"));
		pass.sendKeys("Friday28");
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/textLogin")));
		driver.findElement(By.id("com.geecon.compassionuk_dev:id/textLogin")).click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/llHub")));
		driver.findElement(By.id("com.geecon.compassionuk_dev:id/llHub")).click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.geecon.compassionuk_dev:id/textHero")));
		String hub = driver.findElement(By.id("com.geecon.compassionuk_dev:id/textHero")).getText();
		System.out.println("Successfully Login Compassion and Land on Home Page" + '\n'+ hub);
		Thread.sleep(2000);
		
		driver.quit();
		
		


	}

}
