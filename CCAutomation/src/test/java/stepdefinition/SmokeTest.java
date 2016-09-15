package stepdefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

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

	/*@Given("^A user is currently logged in$")
	public void a_user_is_currently_logged_in() throws Throwable {
		
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='header_logo']/h1/a")).isDisplayed());

	}

	@When("^I click on a section header$")
	public void i_click_on_a_section_header() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='column1_cert']/div/div/div/div/div/div/h3/a")).click();

	}

	@Then("^the user should be navigated to that page$")
	public void the_user_should_be_navigated_to_that_page() throws Throwable {

		driver.findElement(By.id("processDropdown")).isDisplayed();
		String CERT = "Certification";
		Assert.assertEquals(driver.findElement(By.id("processDropdown")).getText(), CERT);
		
	}*/
}
