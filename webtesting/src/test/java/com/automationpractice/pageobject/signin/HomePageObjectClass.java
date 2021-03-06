package com.automationpractice.pageobject.signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjectClass {
	private WebDriver driver;

	private By signInButton = By.cssSelector(".login");

	public HomePageObjectClass(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Navigates to the login page
	 */
	public void goToSignPage() {
		WebElement signInPage = findElement(signInButton);
		signInPage.click();

	}

	private WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

}
