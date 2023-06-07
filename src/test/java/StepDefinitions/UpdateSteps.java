package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateSteps {
    @When("user click edit button on data")
    public void user_click_edit_button_on_data() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Click edit button");
    }
    @When("user edit one of data")
    public void user_edit_one_of_data() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("edit data");
    }
    @Then("user success to update data")
    public void user_success_to_update_data() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Success update data");
    }
}
