package com.OrangeHRM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_login {

	@FindBy(how=How.XPATH, using="//*[@id='txtUsername']")
	WebElement username;


	@FindBy(xpath="//*[@id='txtPassword']")
	WebElement password;


	@FindBy(name="Submit")
	WebElement login_btn;

	WebDriver driver;

	public OrangeHRM_login(WebDriver driver){

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	public void enterUsername(String uname){

		username.sendKeys(uname);
	}

	public void enterPassword(String pwd){

		password.sendKeys(pwd);
	}

	public void clickLogin(){

		login_btn.click();
	}
}
