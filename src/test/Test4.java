package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.hotwire.com/");
    driver.findElement(By.xpath("//*[@id=\"dropdown-right-example\"]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"survey\"]")).click();
	//driver.findElement(By.xpath("//*[@id=\"survey\"]"));
	//driver.findElement(By.xpath("//div[@id=survey]")).click();
	}
}