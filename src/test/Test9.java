package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","\"C:\\\\Selenium\\\\chromedriver.exe\"");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demoqa.com/");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/a")).click();
    driver.findElement(By.xpath("/html/body/header/nav/div/div/div[4]/a/span[1]")).click();
    driver.findElement(By.xpath("/html/body/nav/div/div/div[1]/div/ul/li[1]/div")).click();
    driver.findElement(By.xpath("/html/body/nav/div/div/div[2]/div/ul/li[3]/a")).click();
    
	}

}
