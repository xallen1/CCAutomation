package stepdefinition;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		/*File file = new File("C:/Automation/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();*/
		driver.manage().window().maximize();
		driver.get("https://fsc03console.cadency.trintech.com");
		
	}

	@When("^I am on the R(\\d+)R page$")
	public void i_am_on_the_R_R_page(int arg1) throws Throwable {
	    
		driver.findElement(By.id("UserName")).sendKeys("art");
		driver.findElement(By.id("Password")).sendKeys("2016Demo!");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

	@When("^I click on Total under Reconciling Items$")
	public void i_click_on_Total_under_Reconciling_Items() throws Throwable {
	    
		driver.findElement(By.id("certifyRecItemsTotal")).click();
		
	}

	@Then("^A pop up breakdown of the total and aging details should appear$")
	public void a_pop_up_breakdown_of_the_total_and_aging_details_should_appear() throws Throwable {
	    
		driver.findElement(By.className("highslide-html")).isDisplayed();
		driver.findElement(By.className("highslide-close")).click();
		driver.close();
		
	}

	@When("^I click on Unreconciled Balances amount displayed$")
	public void i_click_on_Unreconciled_Balances_amount_displayed() throws Throwable {
	    
		driver.findElement(By.id("certifyUnRecBalance")).click();
		
	}

	@Then("^A pop up breakdown of the unreconciled balances should appear$")
	public void a_pop_up_breakdown_of_the_unreconciled_balances_should_appear() throws Throwable {
	    
		driver.findElement(By.className("highslide-html")).isDisplayed();
		driver.findElement(By.className("highslide-close")).click();
		driver.close();
		
	}
	
}
