package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/");
    Actions act=new Actions(driver);
   // driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img"));
    //act.contextClick().build().perform();
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img")).click();
    
    //WebElement w=driver.findElement(By.xpath("//*[@id=\"item-4\"]"));
   // act.moveToElement(w).build().perform();
    //driver.close();
	}

}
