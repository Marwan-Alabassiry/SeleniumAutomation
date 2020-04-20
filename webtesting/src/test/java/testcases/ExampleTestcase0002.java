package testcases;

import org.testng.annotations.Test;

import com.automationpractice.pageobject.signin.HomePageObjectClass;
import com.automationpractice.pageobject.signin.SignInPageObjectClass;
import com.automationpractice.webtesting.Testcase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ExampleTestcase0002 extends Testcase{
	
	@Test
	public void Test() {
		HomePageObjectClass home = new HomePageObjectClass(wDriver);
		home.goToSignPage();
		SignInPageObjectClass page = new SignInPageObjectClass(wDriver);
		page.signInWith("besttest@besttest.com", "password");
		Assert.assertEquals(page.authenticationStatus(), "Passed");
	}

	@BeforeClass
	public void Setup() {
		Testcase.init("chrome", "http://automationpractice.com/", 10, true);
	}

	@AfterClass
	public void Cleanup() {
		Testcase.quit();
	}

}
