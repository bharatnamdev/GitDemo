package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class myStepDefinitions {
	@Given("^User is on Greencart landing page$")
	public void user_is_on_Greencart_landing_page() {
		
		WebDriver driver=new ChromeDriver();
		System.out.println("This is method");
	}

	@When("^User search for \"([^\"]*)\" vegetable$")
	public void user_search_for_vegetable(String arg1) {
		System.out.println();
		}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String arg1) {
		System.out.println();
		}

}
