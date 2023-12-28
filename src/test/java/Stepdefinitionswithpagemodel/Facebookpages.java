package Stepdefinitionswithpagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpages {
	WebDriver driver;

	private By txt_username = By.name("email");
	private By txt_password = By.name("pass");
	private By btn_login = By.name("login");
	private By usericon = By.xpath("//*[text()='Lalitha Mamillapalli']");

	public Facebookpages(WebDriver ordriver) {
		this.driver = ordriver;
		if (driver.getTitle().equals("https://facebook.com")) {
			throw new IllegalStateException("this is not corrent page.excert my page is" + driver.getCurrentUrl());
		}

	}

	public void username(String username) {
		driver.findElement(txt_username).sendKeys(username);

	}

	public void password(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickonlogin() {
		driver.findElement(btn_login).click();
	}

	public void usericonname() {
		driver.findElement(usericon).click();
	}

}
