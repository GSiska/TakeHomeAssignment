package StepDefinition;

import Step.LoginStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

    private LoginStep loginStep;

    public LoginStepDefinition(LoginStep loginStep) {
        this.loginStep = loginStep;
    }

    @Given("user is at login page")
    public void userIsAtLoginPage() {
        loginStep.userIsAtLoginPage();
    }

    @When("user inputs valid username and password")
    public void userInputsValidUsernameAndPassword() {
        loginStep.userInputsValidUsernameAndPassword();
    }

    @When("user clicks login button")
    public void userClicksLoginButton() {
        loginStep.userClicksLoginButton();
    }

    @Then("user is at homepage")
    public void userIsAtHomepage() {
        loginStep.userIsAtHomepage();
    }

}
