import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMReg1 {
	WebDriver driver();
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement FullName;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement ContactNo;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement CurrentLocation;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement Experiance;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement KeySkills;
	
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement PreferredInd;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement PrfDept;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement NextButton;
	
	POMTest1(webdriver, d);
	driver=d;
	PageFactory.initElements(driver);
	
	
	public void setFullName(String fname) {
		FullName.sendKeys( fname);
	}
	
	
}
