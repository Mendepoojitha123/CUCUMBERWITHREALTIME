package stepswithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pompage2 {
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='My Info']")
	WebElement Myinfo;
	
	public Pompage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void info() {
		Myinfo.click();
	}

}
