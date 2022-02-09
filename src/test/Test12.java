package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
	String parentWindowHandle= driver.getWindowHandle();
	
	driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
	Set <String> handles=driver.getWindowHandles();
	for(String handle: handles);
	
if(!handles.equals(parentWindowHandle));
{
	driver.switchTo().window(handles);
	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("yfggfdtsreshi");
}
}
}