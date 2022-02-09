import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TetstT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']")).click();
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@class='nav-link                                    nav-item']")).click();
	    //driver.findElement(By.xpath("//*[@value=\"1\"]")).click();
	}

}
