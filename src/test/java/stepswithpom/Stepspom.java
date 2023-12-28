package stepswithpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepspom {
	
	WebDriver driver;
	
	Pompages1 page1;
	Pompage2 page2;
	
	
	
	@Given("open edgedriver bowser")
	public void open_edgedriver_bowser() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//Thread.sleep(3000);
	}

	@And("given orangehrm url")
	public void given_orangehrm_url() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		Thread.sleep(3000);
	}

	@When("enter valid orangehrm credintilas like {string} and {string}")
	public void enter_valid_orangehrm_credintilas_like_and(String username, String password) throws InterruptedException {
		
		page1=new Pompages1(driver);
		
		page1.enterusername(username);
		Thread.sleep(3000);
		page1.enterpassword(password);
		Thread.sleep(3000);
	}

	@And("clickon submit button")
	public void clickon_submit_button() throws InterruptedException {
		
		page1.clickonloginbutton();
		Thread.sleep(3000);
	}

	@Then("user navigate to dashbaord page under click on Assign leaves")
	public void user_navigate_to_dashbaord_page_under_click_on_assign_leaves() throws InterruptedException {
		page2=new Pompage2(driver);
		page2.info();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}



	

}
