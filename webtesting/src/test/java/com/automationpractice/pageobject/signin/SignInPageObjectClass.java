package com.automationpractice.pageobject.signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObjectClass {
	private WebDriver driver;

	private static By userNameLocator = By.id("email");

	private static By passwordLocator = By.id("passwd");

	private static By signInLocator = By.id("SubmitLogin");

	private static By authStatPassed = By.xpath("//p[text()='Welcome to your account. "
			+ "Here you can manage all of your personal information and orders.']");

	private static By authStatFailed = By.xpath("//li[text()='Authentication failed.']");

	public SignInPageObjectClass(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Inputs the user email and password and clicks the submit button
	 * 
	 * @param userName
	 *            email to sign in
	 * @param password
	 *            password for the corresponding email
	 * 
	 */
	public void signInWith(String userName, String password) {
		WebElement EUserName = findElement(userNameLocator);
		EUserName.click();
		EUserName.sendKeys(userName);
		WebElement Epassword = findElement(passwordLocator);
		Epassword.click();
		Epassword.sendKeys(password);
		WebElement signIn = findElement(signInLocator);
		signIn.click();
	}

	private WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * Gets the text displayed on screen after trying to login
	 * 
	 * @return String "Passed" if the authentication was successful and "Failed"
	 *         if the authentication was not successful
	 * 
	 */
	public String authenticationStatus() {
		try {
			findElement(authStatFailed).getText();
			return "Failed";
		} catch (Exception e) {
			findElement(authStatPassed).getText();
			return "Passed";
		}

	}
}
