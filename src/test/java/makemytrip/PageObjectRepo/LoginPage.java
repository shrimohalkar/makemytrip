package makemytrip.PageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver ldriver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[1]/ul/li[4]")
	WebElement mobilenumber;
	
	@FindBy(xpath="//*[@name=\"username\"]")
	WebElement EnterMobOrEmail;
	
	@FindBy(xpath="//*[@class=\"capText font16\"]")
	WebElement Continue;
	
	@FindBy(linkText="or Login via OTP")
	WebElement LoginViaPassword;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	WebElement Password;
}
