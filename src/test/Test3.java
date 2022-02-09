package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotwire.com/");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div/div/div[1]/div/div[3]/form/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div/div/div[1]/div/div[3]/form/div[2]/div/div/input")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div/div/div[1]/div/div[3]/form/div[3]/div/div/input")).sendKeys("London");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div/div/div[1]/div/div[3]/form/div[7]/button/span")).click();
	}

}
