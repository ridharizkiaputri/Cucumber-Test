package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadSteps {
    @When("user click Choose File")
    public void user_click_choose_file() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click choose file");
    }
    @When("user choose file from computer")
    public void user_choose_file_from_computer() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("choose file");
    }
    @When("click open")
    public void click_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click opem");
    }
    @When("click Upload button")
    public void click_upload_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click upload");
    }
    @Then("user success to upload file")
    public void user_success_to_upload_file() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("success upload file");
    }
}
