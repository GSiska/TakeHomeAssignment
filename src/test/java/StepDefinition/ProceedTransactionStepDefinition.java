package StepDefinition;

import Page.Base;
import Step.ProceedTransactionStep;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ProceedTransactionStepDefinition extends Base {

    private ProceedTransactionStep proceedTransactionStep;

    public ProceedTransactionStepDefinition(ProceedTransactionStep proceedTransactionStep) {
        this.proceedTransactionStep = proceedTransactionStep;
    }

    @When("user does checkout")
    public void userDoesCheckout() {
        proceedTransactionStep.userDoesCheckout();
    }

    @When("user inputs valid data to proceed transaction")
    public void userInputsValidDataToProceedTransaction() {
        proceedTransactionStep.userInputsValidDataToProceedTransaction();
    }

    @Then("user is at order verification page")
    public void userIsAtOrderVerificationPage() {
        proceedTransactionStep.userIsAtOrderVerificationPage();
    }


}
