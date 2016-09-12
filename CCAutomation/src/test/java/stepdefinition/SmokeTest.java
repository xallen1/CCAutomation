package stepdefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	
	@Given("^Open Internet Explorer and start application$")
	public void open_Internet_Explorer_and_start_application() throws Throwable {
	    
		File file = new File("C:/Automation/Drivers/IE64DriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://qa82-280.cadency.trintech.com");
		
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
	    
		driver.findElement(By.id("UserName")).sendKeys("art");
		driver.findElement(By.id("Password")).sendKeys("Trintech!@#");
		
	}

	@Then("^user should be able to log in successfully$")
	public void user_should_be_able_to_log_in_successfully() throws Throwable {
	    
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.close();
		driver.quit();
		
	}
	
}
