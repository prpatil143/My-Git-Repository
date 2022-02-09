import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class POMTest1 {
	@Test
	public void Test() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		POMReg1 POMR= new POMReg1(driver);
		
		POMR.setFullName("PRAVIN");
		
		POMR.setEmail("pravin@gmail.com");
		
		POMR.setPassword("12345");
		
		POMR.setContactNo("9850985022");
		
		POMR.setCurrentLocation("XYZ");
		
		POMR.setExperiance("05");
		
		POMR.setKeySkills("ghfggff");
		
		POMR.setPreferedInd("ABC");
		
		POMR.setPrfDept("Quqlity");
		
		POMR.clickNextButton();
	}
}
