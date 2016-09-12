package cc.automation.framework.CCAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CCTestCase {

	@FindBy(id = "UserName")
	static WebElement UserName;

	@FindBy(id = "Password")
	static WebElement Password;

	@FindBy(how = How.CSS, using = "input[type='submit']")
	static WebElement submitBTN;

	@FindBy(how = How.CSS, using = "a[href='https://devidp5.cadency.trintech.com:8181/console/OC?_oc_pid=CloseConsoleTreeNavigator&_oc_tid=CloseConsoleTreeNavigator'")
	static WebElement Close;

	@FindBy(id = "menu_li_2")
	static WebElement closeHierarchy;

	public void login(String username, String password) {

		UserName.sendKeys(username);
		Password.sendKeys(password);
		submitBTN.click();

	}

	public void createActionPlan() {

		Close.click();
		closeHierarchy.click();

	}
}