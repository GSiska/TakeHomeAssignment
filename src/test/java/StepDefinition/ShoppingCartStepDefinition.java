package StepDefinition;

import Step.ShoppingCartStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartStepDefinition {

    public ShoppingCartStep shoppingCartStep;

    public ShoppingCartStepDefinition(ShoppingCartStep shoppingCartStep) {
        this.shoppingCartStep = shoppingCartStep;
    }

    @Given("user is at website first page")
    public void userIsAtWebsiteFirstPage() {
        shoppingCartStep.userIsAtWebsiteFirstPage();
    }

    @When("user filters product from highest to lowest price")
    public void userFiltersProductFromHighestToLowestPrice() {
        shoppingCartStep.userFiltersProductFromHighestToLowestPrice();
    }

    @Then("the top of the products is the highest price")
    public void theTopOfTheProductsIsTheHighestPrice() {
        shoppingCartStep.theTopOfTheProductsIsTheHighestPrice();
    }

}
