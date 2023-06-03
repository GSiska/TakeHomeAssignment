package StepDefinition;

import Step.ProceedTransactionStep;
import Step.ShoppingCartStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProceedTransactionStepDefinition {

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
