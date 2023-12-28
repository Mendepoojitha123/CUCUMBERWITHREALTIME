package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;

public class orangehrmsteps {
	WebDriver driver= null;
	@Given("enter the chrome browser")
	public void enter_the_chrome_browser() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
	   
	}

	@And("enter the login page")
	public void enter_the_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}

	@When("enter the valid username and valid password")
	public void enter_the_valid_username_and_valid_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	   
	}

	@And("click on the login module")
	public void click_on_the_login_module() {
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user enter the home page")
	public void user_enter_the_home_page() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
	   
	}




}
