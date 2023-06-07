package Step;

import Page.LoginPage;
import Page.ShoppingCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import Enum.Credential;


public class ShoppingCartStep {

    private LoginPage loginPage;
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartStep(LoginPage loginPage, ShoppingCartPage shoppingCartPage){
        this.loginPage = loginPage;
        this.shoppingCartPage = shoppingCartPage;
    }

    public void userIsAtWebsiteFirstPage() {
        loginPage.userIsAtLoginPage();
        loginPage.inputLoginUserName();
        loginPage.inputloginPassword();
        loginPage.loginSubmitButton.click();
    }

    public void userFiltersProductFromHighestToLowestPrice() {
        shoppingCartPage.clickOnProductFilter();
        shoppingCartPage.clickOnOptionHighPriceToLowPrice();
    }

    public void theTopOfTheProductsIsTheHighestPrice() {
        Integer firstHighestPriceProduct = Integer.parseInt(shoppingCartPage.highestProductPrice().substring(1,shoppingCartPage.secondHighestProductPrice().indexOf(".")));
        Integer secondHighestPriceProduct = Integer.parseInt(shoppingCartPage.secondHighestProductPrice().substring(1,shoppingCartPage.secondHighestProductPrice().indexOf(".")));
        Assert.assertTrue(firstHighestPriceProduct > secondHighestPriceProduct,"Product is not sorted from highest price to lowest price!");
    }

    public void userSelectsTheFirstProduct() {
        shoppingCartPage.clickOnFirstProduct();
    }

    public void userIsDirectedToSelectedProductPage() {
        Assert.assertTrue(shoppingCartPage.selectedProductNameText().equals(Credential.MOSTEXPENSIVEPRODUCTNAME.getCredential()) && shoppingCartPage.selectedProductPriceText().equals(Credential.MOSTEXPENSIVEPRODUCTPRICE.getCredential()
                ), "The selected product does not match!" );
    }

    public void userClicksOnAddToCartButton() {
        shoppingCartPage.userClicksOnAddToCartButton();
    }

    public void removeButtonAppears() {
        shoppingCartPage.removeButtonAppears();
    }
}
