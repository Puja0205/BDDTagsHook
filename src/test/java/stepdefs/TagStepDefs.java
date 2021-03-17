package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TagStepDefs {

	@Given("User is in google page")
	public void user_is_in_google_page() {
		System.out.println("User is in Google page");
	}
	
	@Before (value= "@RegressionTest", order=1)
	public void SetupProperty() {
		System.out.println("Read From Property File");
	}
	

	@Before (value="@RegressionTest", order=2)
	public void SetupBrowser() {
		System.out.println("Initialize Browser");
	}

	@BeforeStep("@SmokeTest")
	public void BeforeEachStep() {
		System.out.println("Before each Step");
	}

	@When("User enters invalid cred")
	public void user_enters_invalid_cred() {
		System.out.println("User enters invalid cred");
	}

	
	@Given("User is on Deal page")
	public void user_is_on_Deal_page() {
		System.out.println("User is on Deal page");
	}

	

	@Given("User is on company page")
	public void user_is_on_company_page() {
		System.out.println("User is on company page");
	}

	
	@Given("User click logout")
	public void user_click_logout() {
		System.out.println("User click logout");
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@Given("User is on Task page")
	public void user_is_on_Task_page() {
		System.out.println("User is on Task page");
	}

	@Given("User is on contact page")
	public void user_is_on_contact_page() {
		System.out.println("User is on contact page");
	}

	@Given("User search Selenium Text")
	public void user_search_Selenium_Text() {
		System.out.println("User search Selenium Text");
	}
	
	@Given("User search Java Text")
	public void user_search_Java_Text() {
		System.out.println("User search Java Text");
	}

	

	@Given("User search Cucumber Text")
	public void user_search_Cucumber_Text() {
		System.out.println("User search Cucumber Text");
	}

	@AfterStep
	public void AfterEachStep() {
		System.out.println("After each Step");
	}

	@After
	public void AfterScenario() {
		System.out.println("After each scenario");
	}

}
