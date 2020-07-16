package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rediffTitle 
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Javaworkspace\\\\com.infi.hos\\\\driverfiles\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://www.rediff.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void verifyUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.rediff.com/");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	//class, testng.xml, pom.xml, cmd , batch file

}
