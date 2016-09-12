package cc.automation.framework.CCAutomation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Script extends CCTestCase {

	static WebDriver driver;
	

	@Test
	public void exampleTest() {
		// TODO Auto-generated method stub
		File file = new File("C:/Automation/Drivers/IE64DriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();

		driver.navigate().to("https://qa82-280.cadency.trintech.com/CadencyOAuth/SSO/Logout");
		driver.manage().window().maximize();
		CCTestCase CCTest = PageFactory.initElements(driver, CCTestCase.class);

		CCTest.login("art", "Trintech!@#");
		driver.findElement(By.className("dashboard_mod_header_link")).click();
		driver.close();
		driver.quit();

	}

}