package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonPages.Base;

public class login extends Base {

	WebDriver driver;
	WebDriverWait wait;

	@Test(priority = 1, description = "this function will login into specific environment")
	public void Login_Into_TestEnvironment() throws Throwable {

		test = extent.createTest("Check Login Functionality");
		/* For test purpose - test2 to test 6 */

		System.out.println("driver open");
		driver = drivercall(); /* Call broswer - Base.java file */

		test.log(Status.PASS, "Home Page Redirection Successful");

	}
}
