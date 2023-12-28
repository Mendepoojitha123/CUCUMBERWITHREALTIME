package cucumberfacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpages {
	WebDriver driver;
	private By txtusrname=By.name("email");
	private By txt_password=By.name("pass");
	private By btn_login=By.name("login");
	private By usericon=By.xpath("//*[text()='Lalitha Mamillapalli']");
	
	
	public Facebookpages(WebDriver driver) {
		this.driver= driver;
		
	}
	public void name(String usname) {
		driver.findElement(txtusrname).sendKeys(usname);
		
	}
	public void pswd(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}
	public void login() {
		driver.findElement(btn_login).click();
		

}
	public void usericn() {
		driver.findElement(usericon).click();
}}