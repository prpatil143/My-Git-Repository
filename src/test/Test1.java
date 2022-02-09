package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.hotwire.com/");
    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/div/button/span[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[1]/button[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"signin-model\"]/div/div/div[2]/form/div[1]/div[3]/label")).sendKeys("ShreeGanesh");
    driver.findElement(By.xpath("//*[@id=\"signin-model\"]/div/div/div[2]/form/div[1]/div[4]/label")).sendKeys("123");
	}

}
