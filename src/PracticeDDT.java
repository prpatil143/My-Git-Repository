import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDDT {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		FileInputStream file= new FileInputStream("D://dataSheet.xlsx//");
		XSSFWorkbook wb=new XSSFWorkbook (file);
		XSSFSheet sh= wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		int colcount=sh.getRow(0).getLastCellNum();

		for(int i=1; i<rowcount;i++)
		{

			XSSFRow row=sh.getRow(i);
			String a=row.getCell(0).toString();
			String b=row.getCell(1).toString();
		
			
			driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys(a);
			driver.findElement(By.xpath("//div[@id=\"identifierNext\"]//span[@class=\"VfPpkd-vQzf8d\"]")).click();
			
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(b);
			driver.findElement(By.xpath("//span[@jsname=\"V67aGc\"and text()=\"Next\"]")).click();
			
			Thread.sleep(5000);
			
			driver.navigate().back();
		}
	}
}


