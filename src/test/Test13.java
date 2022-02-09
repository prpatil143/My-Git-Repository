package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
    
    WebDriver driver= new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
    String parentHandle=driver.getWindowHandle();
    driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/a")).click();
    Set <String> handles=driver.getWindowHandles();
  
    driver.switchTo().window("handle");
    driver.findElement(By.xpath("//*[@id=\"Open New Window\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[2]/a")).click();
	}

}
	