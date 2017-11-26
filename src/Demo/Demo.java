package Demo;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Demo {
	public static AndroidDriver driver;
	
	
	@BeforeTest
	public void launchApp() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NVHQ4PQSSKJFNB59");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.testerapp");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.testerapp.MainActivity");
		
		System.out.println("Here I am Going to Check All Buttons");
		System.out.println(".........................................");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
	}
	
	@Test
	public void perform() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 1']")).click();
		//driver.findElement(By.name("BUTTON 1")).click();
		WebElement element =driver.findElement(By.xpath("//android.widget.TextView[@text='Button1 header']"));
		String stng = element.getText();
		Assert.assertEquals("Button1 header",stng);
		System.out.println("You have pressed button1");
		driver.findElement(By.name("OK")).click();
		System.out.println("Successfuly clicked on OK Button");
		System.out.println(".......................................");
		
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 2']")).click();
		//driver.findElement(By.name("BUTTON 2")).click();
		WebElement element1 =driver.findElement(By.xpath("//android.widget.TextView[@text='Button2 header']"));
		String stng1 = element1.getText();
		Assert.assertEquals("Button2 header",stng1);
		System.out.println("You have pressed button2");
		driver.findElement(By.name("OK")).click();
		System.out.println("Successfuly clicked on OK Button");
		System.out.println(".......................................");

		
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 3']")).click();
	  //driver.findElement(By.name("BUTTON 3")).click();
	    WebElement element2 =driver.findElement(By.xpath("//android.widget.TextView[@text='Button3 header']"));
		String stng2 = element2.getText();
		Assert.assertEquals("Button3 header",stng2);
		System.out.println("You have pressed button3");
		driver.findElement(By.name("OK")).click();
		System.out.println("Successfuly clicked on OK Button");
		System.out.println(".......................................");
		
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//android.widget.TextView[@text='BUTTON 4']")).click();
	  //driver.findElement(By.name("BUTTON 4")).click();
	    WebElement element3 =driver.findElement(By.xpath("//android.widget.TextView[@text='Button4 header']"));
		String stng3 = element3.getText();
		Assert.assertEquals("Button4 header",stng3);
		System.out.println("You have pressed button4");
		driver.findElement(By.name("OK")).click();
		System.out.println("Successfuly clicked on OK Button");
		System.out.println(".......................................");	
		driver.closeApp();	
	}	
}
