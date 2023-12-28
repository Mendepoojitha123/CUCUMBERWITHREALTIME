
package cucumberfacebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookstepdefinition {
	WebDriver driver;
	Facebookpages fbpage;
	
	@Given("open chromedriver")
	public void open_chromedriver() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    
	}

	@Given("user on the facebook page")
	public void user_on_the_facebook_page() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}

	@When("user enters facebook valid and invalid credentials {string} and {string}")
	public void user_enters_facebook_valid_and_invalid(String username,String pwd) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		fbpage=new Facebookpages(driver);
		fbpage.name(username);
		fbpage.pswd(pwd);
		
	}

	@When("user on the login button")
	public void user_on_the_login_button() {
		fbpage.login();
	}

	@Then("navigate to facebook icon")
	public void navigate_to_facebook_icon() {
		
		fbpage.usericn();
	}

	@When("user enters facebook valid and invalid credentials poojitha and pooja123")
	public void user_enters_facebook_valid_and_invalid_credentials_poojitha_and_pooja123() {
		driver.close();
	}




}
