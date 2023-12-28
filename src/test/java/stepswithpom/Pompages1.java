package stepswithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pompages1 {
	
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement txt_username;
	
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement btn_login;
	
	
	public Pompages1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void enterusername(String username) {
		txt_username.sendKeys(username);
		
		}
	
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickonloginbutton() {
		btn_login.click();
	}
	

}
