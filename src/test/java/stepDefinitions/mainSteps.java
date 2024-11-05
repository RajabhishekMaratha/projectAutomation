package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	@Given("User is on Netbanking login page")
	public void user_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Netbanking login page");
	}
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User login into application with "+string+" and password "+string2);
	}
	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
		System.out.println("Homepage is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}
}
