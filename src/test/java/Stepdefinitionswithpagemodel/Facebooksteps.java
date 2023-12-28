package Stepdefinitionswithpagemodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooksteps {
	
	WebDriver driver;
	Facebookpages fbpage;
	
	@Given("open edgedriver")
	public void open_edgedriver() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

	@And("uesr on facebook homepage")
	public void uesr_on_facebook_homepage() throws InterruptedException {
		driver.get("https://facebook.com");
		Thread.sleep(3000);
	}

	@When("user enters facebook valid and inavlid {string} and {string}")
	public void user_enters_facebook_valid_and_inavlid_and(String username, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	   fbpage=new Facebookpages(driver);
		fbpage.username(username);
		Thread.sleep(3000);
		
		fbpage.password(password);
		Thread.sleep(3000);
		
	}


	@And("user click on facebook login button")
	public void user_click_on_facebook_login_button() throws InterruptedException {
		fbpage.clickonlogin();
		Thread.sleep(3000);
	}

	@Then("finally user navigate to stories page in facebook")
	public void finally_user_navigate_to_stories_page_in_facebook() throws InterruptedException {
		fbpage.usericonname();
		Thread.sleep(3000);
	}

	@And("user enters facebook valid and inavlid userpooja and userpooja123")
	public void user_enters_facebook_valid_and_inavlid_userpooja_and_userpooja123() {
		driver.close();
		driver.quit();
	}

	
	

}
