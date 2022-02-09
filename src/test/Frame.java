package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
    driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
    driver.findElement(By.xpath("/html/body/section/div/div")).click();
    driver.switchTo().frame("SingleFrame");    
    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("HE RAM");
    driver.switchTo().defaultContent();
	}

}
