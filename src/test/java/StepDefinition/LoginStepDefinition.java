package StepDefinition;

import Step.LoginStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {

    private LoginStep loginStep;
    public WebDriver driver;

    @Given("user is at login page")
    public void userIsAtLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");;
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
