package StepDefinition;

import Step.LoginStep;
import io.cucumber.java.en.Given;

public class LoginStepDefinition {

    private LoginStep loginStep;

    @Given("user is at login page")
    public void userIsAtLoginPage() {
        loginStep.userIsAtLoginPage();
    }
}
