package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateSteps {
    @Given("the user is on homepage")
    public void the_user_is_on_homepage() {
        System.out.println("user is on homepage");
    }
    @When("user click add button")
    public void user_click_add_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Click on add");
    }
    @When("user input First Name")
    public void user_input_first_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Input first name");
    }
    @When("user input Last Name")
    public void user_input_last_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Input last name");
    }
    @When("user input Email")
    public void user_input_email() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Input email");
    }
    @When("user input Age")
    public void user_input_age() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Input age");
    }
    @When("user input Salary")
    public void user_input_salary() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Input salary");
    }
    @When("user input Department")
    public void user_input_department() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Input department");
    }
    @When("user click submit")
    public void user_click_submit() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Click submit");
    }
    @Then("user success add data to table")
    public void user_success_add_data_to_table() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Created data");
    }
}
