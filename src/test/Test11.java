package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://abstracta.us/blog/software-testing/best-demo-websites-for-practicing-different-types-of-software-tests/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	Actions act=new Actions(driver);
	WebElement w=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/ul/div[2]/button/a"));
	act.moveToElement(w).build().perform();
	
	WebElement v=driver.findElement(By.xpath("/html/body"));
	
	act.moveToElement(v).build().perform();
	
	
	}

}

