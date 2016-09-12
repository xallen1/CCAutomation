package cc.automation.framework.CCAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseSetup {

	private WebDriver driver;
	static String driverPath1 = "C:/Automation/Drivers/IE64DriverServer.exe";
	static String driverPath2 = "C:/Automation/Drivers/chromedriver.exe";
	static String driverPath3 = "C:/Automation/Drivers/IE32DriverServer.exe";

	public WebDriver getDriver() {

		return driver;

	}
	
	@Parameters({"browser", "URL"})
	@BeforeClass
	public void initializeTestBaseSetup(String browser, String URL){
		
		try {
			
				setDriver(browser, URL);
				
		} catch (Exception e){
			
				System.out.println("Error...." + e.getStackTrace());
		}
		
		
		}

	private void setDriver(String browser, String URL) {

		switch (browser) {

		case "IE32":
			driver = initInternetExplorer32Driver(URL);
			break;

		case "IE64":
			driver = initInternetExplorer64Driver(URL);
			break;

		case "CH":
			driver = initChromeDriver(URL);
			break;

		}
	}

	private static WebDriver initInternetExplorer64Driver(String URL) {
		System.out.println("Launching Internet Explorer with new profile..");
		System.setProperty("webdriver.internetexplorer.driver", driverPath1 + "IE64DriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		return driver;

	}

	private static WebDriver initChromeDriver(String URL) {
		System.out.println("Launching Google Chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath2 + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		return driver;
	}

	private static WebDriver initInternetExplorer32Driver(String URL) {
		System.out.println("Launching Internet Explorer with new profile..");
		System.setProperty("webdriver.internetexplorer.driver", driverPath3 + "IE32DriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		return driver;
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.close();
		driver.quit();
		
		
	}
		
	}

