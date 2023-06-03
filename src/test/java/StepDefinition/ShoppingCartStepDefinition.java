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

    @When("user selects the first product")
    public void userSelectsTheFirstProduct() {
        shoppingCartStep.userSelectsTheFirstProduct();
    }

    @Then("user is directed to selected product page")
    public void userIsDirectedToSelectedProductPage() {
        shoppingCartStep.userIsDirectedToSelectedProductPage();
    }

    @When("user clicks on add to cart button")
    public void userClicksOnAddToCartButton() {
        shoppingCartStep.userClicksOnAddToCartButton();
    }

    @Then("remove button appears")
    public void removeButtonAppears() {
        shoppingCartStep.removeButtonAppears();
    }
}
