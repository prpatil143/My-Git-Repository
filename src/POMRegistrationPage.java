import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POMRegistrationPage {
	
	WebDriver driver;
	
		@FindBy(xpath="//a[text()='Register Now']")
		WebElement RegLink;
		
		//@FindBy(xpath="//span[@id=\"register-name-validation-icon\"]") 
		//WebElement FullName;
		@FindBy(name="name")
		WebElement FullName;
		
		
		@FindBy(xpath="//input[@id='register-username']")
		WebElement PublicUserName;
		
		@FindBy(xpath="//input[@id='register-email']")
		WebElement Email;
		
		@FindBy(xpath="//input[@id='register-password']")
		WebElement Pass;
		
		@FindBy(xpath="//input[@id='register-terms_of_service']")
		WebElement TermOfServices;
		
		@FindBy(xpath="//input[@id='register-honor_code']")
		WebElement HonorCode;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement CreateAccount;
		
		
		POMRegistrationPage(WebDriver d){
			driver=d;
			PageFactory.initElements(d, this);
	}
		
		public void clickRegLink() {
			RegLink.click();
		}
		
		
		public void setFullName(String fname) {
			FullName.sendKeys(fname);
		}
		
		public void setPublicUserName(String uname) {
			PublicUserName.sendKeys(uname);
		}
		
		public void setEmail(String mail) {
			Email.sendKeys(mail);
		}
		
		
		public void setPass(String pwd) {
			Pass.sendKeys(pwd);
		}
		
		public void clickTermOfServices() {
			TermOfServices.click();
		}
		public void clickHonorCode() {
			HonorCode.click();
		}
		public void clickCreateAccount() {
			CreateAccount.click();
		}
		
		
			
		}

