package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    //Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ShreeGanesha");
    //Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123");
    driver.findElement(By.xpath("//*[@value=\"1\"]")).click();
	}  

}
