package seleniumproject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumsoftware\\chromedriver.exe");
SoftAssert soft = new SoftAssert();
		ChromeOptions o1 = new ChromeOptions();
		o1.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(o1);



		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String expectedtitle = "facebook.com";
		
		String actualtitle = driver.getTitle();
		
		System.out.println("before Assert");
		
		//Assert would stop execution further if test case fails.If wedon't want to stop execution we use
		//softassert.
		
		//Assert.assertEquals(actualtitle, expectedtitle);
		
		
		soft.assertEquals(actualtitle, expectedtitle);
		System.out.println("After Assert");
		//softAssert wouln't give failure info. For that weuse assertAll()
		
		soft.assertAll();
		
		
		
		
		
		
	}

}
