package stepDefinitions;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseClass {
	
	//Logging
		@Given("Entering the url {string}")
		public void entering_the_url(String url) {
			browseConfigChrome();
		    implicityWait();
		    openUrl(url);
		    maximizeWindow();
		}
		@Given("Entering the username {string} and password {string}")
		public void entering_the_username_and_password(String username, String pass) {
			WebElement user = locateByXPath("//input[@name='username']");
			textInput(user, username);
			locateByXPath("//input[@name='password']").sendKeys(pass);
		    
		}
		@Then("logging into the profile")
		public void logging_into_the_profile() {
		    locateByXPath("//button[@type='submit']").click();
		}
	
	// Fetching detail
	@Given("Getting all details")
	public void getting_all_details() {
	    locateByXPath("//button[@type='submit']").click();
	    String text = locateByXPath("//span[@class='oxd-text oxd-text--span']").getText();
	    System.out.println("General Search ="+text);
	}
	
	@Given("Searching them by emp id {string} and validating them")
	public void searching_them_by_emp_id_and_validating_them(String string) {
		locateByXPath("(//input[@class='oxd-input oxd-input--active'])[2]").sendKeys(string);
		locateByXPath("//button[@type='submit']").click();
		String text = locateByXPath("//span[@class='oxd-text oxd-text--span']").getText();
	    System.out.println("Search through id ="+text);
	}

	
	//Creating Emp details
	@Given("Selecting and adding the requird details first name {string} last name {string} Middle name {string} and emp id")
	public void selecting_and_adding_the_requird_details_first_name_last_name_middle_name_and_emp_id(String first, String last, String middle) {
	    locateByXPath("//a[text()='Add Employee']").click();
	    locateByXPath("//input[@name='firstName']").sendKeys(first);
	    locateByXPath("//input[@name='middleName']").sendKeys(middle);
	    locateByXPath("//input[@name='lastName']").sendKeys(last);
	}
	@Given("Saving the created detail")
	public void saving_the_created_detail() {
	    locateByXPath("//button[@type='submit']").click();
	}
	@Then("Validating the detail")
	public void validating_the_detail() throws InterruptedException {
	    Thread.sleep(2000);

	}
	
	//Adding Job Details
	@Given("Entering into the job details")
	public void entering_into_the_job_details() {
		implicityWait();
		String text = locateByXPath("(//input[@class='oxd-input oxd-input--active'])[2]").getText();
		locateByXPath("//a[text()='Employee List']").click();
		locateByXPath("(//input[@class='oxd-input oxd-input--active'])[2]").sendKeys(text);
		locateByXPath("//button[@type='submit']").click();
		String result = locateByXPath("//span[@class='oxd-text oxd-text--span']").getText();
	    System.out.println("Search through id ="+result);
	    locateByXPath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]").click();
	    locateByXPath("//a[text()='Job']").click();
	}
	@Given("Editing the job details")
	public void editing_the_job_details() {
	    locateByXPath("(//div[@class='oxd-select-text-input'])[1]").click();
	    locateByXPath("//span[text()='Chief Technical Officer']").click();
	}
	@Then("Saving the details")
	public void saving_the_details() {
	    locateByXPath("//button[@type='submit']").click();
	}
	
	//Deleting Emp Details
	@Given("Getting details for deleting")
	public void getting_details_for_deleting() {
		locateByXPath("//a[text()='Employee List']").click();
		locateByXPath("(//input[@class='oxd-input oxd-input--active'])[2]").sendKeys("0212");
		locateByXPath("//button[@type='submit']").click();
		locateByXPath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]").click();
		locateByXPath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']").click();
	}
	@Given("Searching them by emp id {int} and validating the delete")
	public void searching_them_by_emp_id_and_validating_the_delete(Integer int1) {
		locateByXPath("(//input[@class='oxd-input oxd-input--active'])[2]").sendKeys("0212");
		locateByXPath("//button[@type='submit']").click();
		String text = locateByXPath("//span[@class='oxd-text oxd-text--span']").getText();
	    System.out.println("Search After Deletion ="+text);
	}
	
	
	

	
}
