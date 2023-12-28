package demoguru;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Demoguru {
	WebDriver driver = null;
	@Given("open browser")
	public void open_browser() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
	   
	}

	@And("user on the login page")
	public void user_on_the_login_page() {
	    driver.get("https://demo.guru99.com/test/newtours/login.php");
	}

	@When("user enter {string} and {string}")
	public void user_enter_mercury_and_mercury(String usname,String pwd) {
		driver.findElement(By.name("userName")).sendKeys(usname);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//*[@name='submit']")).click();
	}

	@Then("user on the demoguru page")
	public void user_on_the_demoguru_page() {
	   driver.close();
	}

}
