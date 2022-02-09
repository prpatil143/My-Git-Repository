import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMTest {
	
	@Test
	public void Test()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://learner.demo.edunext.co/register?next=%2F");


		POMRegistrationPage RGPage=new POMRegistrationPage(driver);
		
		
		RGPage.clickRegLink();
		
		RGPage.setFullName("pravin");
		
		RGPage.setPublicUserName("pa");
		
		RGPage.setEmail("pravin@gmail.com");
		
		RGPage.setPass("12345");
		
		RGPage.clickTermOfServices();
		
		RGPage.clickHonorCode();
		
		RGPage.clickCreateAccount();
		
		
		}
		
	}
