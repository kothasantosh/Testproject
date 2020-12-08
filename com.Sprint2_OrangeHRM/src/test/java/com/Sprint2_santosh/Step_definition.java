//package com.Sprint2_santosh;
//
//import java.util.concurrent.TimeUnit;
//
////import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.OrangeHRM_pages.OrangeHRM_PIM;
//import com.OrangeHRM_pages.OrangeHRM_login;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Step_definition {
//	WebDriver driver=null;
//	OrangeHRM_login login;
//	OrangeHRM_PIM pimPg;
//	
//	@Given("User is on OrangeHRM login page")
//	public void user_is_on_OrangeHRM_login_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		login= new OrangeHRM_login(driver);
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//		System.out.println("User is on login page");
//	    
//	}
//
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String string, String string2) throws InterruptedException {
//		login.enterUsername(string);
//		login.enterPassword(string2);
//		Thread.sleep(2000);
//		System.out.println("User entered the credentials");
//	    
//	}
//
//	@When("User clicks on login")
//	public void user_clicks_on_login() {
//		login.clickLogin();
//		System.out.println("User clicked on login button");
//	}
//
//	@Then("User should be able to see alert message as Invalid Credentials")
//	public void user_should_be_able_to_see_alert_message_as_Invalid_Credentials() {
//		String title=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
//		if(title.contentEquals("Invalid credentials")) System.out.println("Title Matched");
//		else System.out.println("Title NOT Matched");
//		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//		System.out.println("Alert message displayed as \"Invalid credentials\"");
//		driver.close();
//	}
//
//	@When("User leaves username blank")
//	public void user_leaves_username_blank() {
//		login.enterUsername("");
//		login.enterPassword("admin123");  
//	}
//
//	@When("Clicks the button")
//	public void clicks_the_button() {
//
//		login.clickLogin();
//	    
//	}
//
//	@Then("User should be able to see username alert message")
//	public void user_should_be_able_to_see_username_alert_message() {
//		String title=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
//		if(title.contentEquals("Username cannot be empty")) System.out.println("Title Matched");
//		else System.out.println("Title NOT Matched");
//		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//		System.out.println("Alert message displayed as Username cannot be empty");
//		driver.close();
//    
//	}
//
//	@When("User leaves password blank")
//	public void user_leaves_password_blank() {
//		login.enterUsername("Admin");
//		login.enterPassword("");
//	    
//	}
//
//	@When("Clicks the login button")
//	public void clicks_the_login_button() {
//		login.clickLogin();
//	    
//	}
//
//	@Then("User should be able to see password alert message")
//	public void user_should_be_able_to_see_password_alert_message() {
//		String title=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
//		if(title.contentEquals("Password cannot be empty")) System.out.println("******Title Matched");
//		else System.out.println("*****Title NOT Matched");
//		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//		System.out.println("Alert message displayed as Password cannot be empty");
//	    driver.close();
//	}
//	
//	@When("User leaves username and password fields blank")
//	public void user_leaves_username_and_password_fields_blank() {
//		login.enterUsername("");
//		login.enterPassword("");
//	    
//	}
//
//	@Then("User should be able to see alert message")
//	public void user_should_be_able_to_see_alert_message() {
//		String title=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
//		if(title.contentEquals("Username cannot be empty")) System.out.println("******Title Matched");
//		else System.out.println("*****Title NOT Matched");
//		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//		System.out.println("Alert message displayed as Username cannot be empty");
//		driver.close();
//	}
//
//	@When("User enters username and password")
//	public void user_enters_username_and_password() {
//		login.enterUsername("Admin");
//		login.enterPassword("admin123");
//	}
//
//	@Then("User is navigated to Dashboard page")
//	public void user_is_navigated_to_Dashboard_page() {
//		System.out.println("User is on Dashboard page");
//		driver.close();
//	}
//
//	@Given("User is on Dashboard page")
//	public void user_is_on_Dashboard_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		login = new OrangeHRM_login(driver);
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//		login.enterUsername("Admin");
//		login.enterPassword("admin123");
//		login.clickLogin();
//		pimPg = new OrangeHRM_PIM(driver);
//		pimPg.checkDashboardIsDisplayed();
//
//	}
//
//	@When("User is navigated to PIM Module")
//	public void user_is_navigated_to_PIM_Module() {
//			/*WebElement pim1 = pimPg.clickPimModule();
//			Actions act = new Actions(driver);
//			act.moveToElement(pim1).doubleClick().perform();*/
//		pimPg.clickPimModule();
//	}
//
//	@When("User clicks on Optional feilds module in Configuration Module")
//	public void user_clicks_on_Optional_feilds_module_in_Configuration_Module() {
//		/*WebElement configuration = pimPg.clickconfiguration();
//		Actions act1 = new Actions(driver);
//		act1.moveToElement(configuration).doubleClick().build().perform();
//		WebElement optional = pimPg.clickoptional();
//		Actions act2 = new Actions(driver);
//		act2.moveToElement(optional).doubleClick().build().perform();*/
//		pimPg.clickconfiguration();
//		pimPg.clickoptional();
//	}
//
//	@Then("User can view the Configure PIM Module")
//	public void user_can_view_the_Configure_PIM_Module() {
//		/*String title=driver.findElement(By.xpath("//*[@id=content']/div/div[1]/h1")).getText();
//		if(title.contentEquals("Configure PIM")) System.out.println("Title Matched");
//		else System.out.println("Title NOT Matched");
//		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//		System.out.println("User can view the Configure PIM Module");
//		//driver.close();*/
//		System.out.println("User can view the Configure PIM Module");
//		driver.close();
//	}
//
//	@When("User clicks on Custom feilds module in Configuration Module")
//	public void user_clicks_on_Custom_feilds_module_in_Configuration_Module() {
//		/*WebElement configuration = pimPg.clickconfiguration();
//		Actions act1 = new Actions(driver);
//		act1.moveToElement(configuration).doubleClick().perform();*/
//		pimPg.clickconfiguration();
//		pimPg.clickcustom();
//
//	}
//
//	@Then("User can view the Defined Custom Fields")
//	public void user_can_view_the_Defined_Custom_Fields() {
//		String title=driver.findElement(By.xpath("//*[@id='customFieldListPane']/div[1]/h1")).getText();
//		if(title.contentEquals("Defined Custom Fields")) System.out.println("Title Matched");
//		else System.out.println("Title NOT Matched");
//		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//		System.out.println("User can view the Defined Custom Fields");
//		driver.close();
//
//	}
//
//	@Then("User can view details of all employees")
//	public void user_can_view_details_of_all_employees() throws InterruptedException {
//		System.out.println("User can view details of all employees");
//		Thread.sleep(2000);
//		driver.close();
//
//	}
//
//	@Then("User clicks Add Employee in PIM Module")
//	public void user_clicks_Add_Employee_in_PIM_Module() {
//		pimPg.clickaddEmployee();
//		
//	}
//
//	@Then("User should be able to add details of new employee")
//	public void user_should_be_able_to_add_details_of_new_employee() throws InterruptedException {
//		pimPg.enterfirstname("santosh");
//		pimPg.entermiddlename("k");
//		pimPg.enterlastname("kotha");
//		pimPg.clickCheckBox();
//		pimPg.enterUserName("santoshkotha");
//		pimPg.enterPassWord("9398794944");
//		pimPg.enterConfirmPassword("9398794944");
//		pimPg.clickSave();
//		Thread.sleep(2000);
//		driver.close();
//	}
//
//	@Then("User clicks on Reports in PIM Module")
//	public void user_clicks_on_Reports_in_PIM_Module() throws InterruptedException {
//		pimPg.clickReports();
//		pimPg.enterReportsName("PIM Sample Report");
//		Thread.sleep(2000);
//	}
//
//	@Then("User searches for Employee reports")
//	public void user_searches_for_Employee_reports() throws InterruptedException {
//		pimPg.clickSearch();
//		Thread.sleep(2000);
//		driver.close();
//	}
//
//	@When("User clicks on My Info Module")
//	public void user_clicks_on_My_Info_Module() {
//		pimPg.clickMyInfo();
//		
//	}
//
//	@Then("User Should be able view his personal details")
//	public void user_Should_be_able_view_his_personal_details() {
//		System.out.println("User Should be able view his personal details");
//		driver.close();
//
//	}
//	@Given ("User is on OrangeHRM login page to enter data of employee")
//	public void user_is_on_OrangeHRM_login_page_to_enter_data_of_employee(){
//		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		login = new OrangeHRM_login(driver);
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//		System.out.println("User is on OrangeHRM login page");
//		
//	}
//
//	@When("User enters username and password of the employee")
//	public void user_enters_username_and_password_of_the_employee() {
//		login.enterUsername("santoshkotha");
//		login.enterPassword("9398794944");
//
//	}
//
//	@Then("User clicks on login and is navigated to Dashboard page")
//	public void user_clicks_on_login_and_is_navigated_to_Dashboard_page() {
//		login.clickLogin();
//	}
//
//	@Then("User clicks on My Info Module and can view his personal details only")
//	public void user_clicks_on_My_Info_Module_and_can_view_his_personal_details_only() throws InterruptedException {
//		pimPg = new OrangeHRM_PIM(driver);
//		pimPg.clickMyInfo();
//		Thread.sleep(2000);
//		driver.close();
//	}
//
//	@When("User should clicks on Logout in Welcome Menu")
//	public void user_should_clicks_on_Logout_in_Welcome_Menu() {
//		pimPg.clickWelcomeMenu();
//		pimPg.clickLogout();
//
//	}
//
//	@Then("User should be able to see OrangeHRM Login Page")
//	public void user_should_be_able_to_see_OrangeHRM_Login_Page() {
//		System.out.println("User should be able to see OrangeHRM Login Page");
//		driver.close();
//
//	}
//}
