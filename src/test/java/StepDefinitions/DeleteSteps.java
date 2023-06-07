package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteSteps {
    @When("user click delete button")
    public void user_click_delete_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click delete button");
    }
    @Then("user success to delete data on table")
    public void user_success_to_delete_data_on_table() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("success delete data");
    }
}
