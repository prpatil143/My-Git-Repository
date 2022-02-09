import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Handle:"+parent);
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click(); 
		
		Set<String>handles=driver.getWindowHandles();
		
		for (String handle : handles)
		{ 
			System.out.println("Child Handles"+handle);
			if(!handle.equals(parent))
			{
				
			driver.switchTo().window(handle);
			
		
		
		driver.findElement(By.xpath("//select[@id='selectnav1']")).click();
		Thread.sleep(5000);
		
		driver.close();

	}  
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("HE RAM");
			
		
		}
		}
}
