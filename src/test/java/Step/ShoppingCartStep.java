package Step;

import Page.LoginPage;
import Page.ShoppingCartPage;
import org.testng.Assert;


public class ShoppingCartStep {

    LoginPage loginPage;
    ShoppingCartPage shoppingCartPage;

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
        Assert.assertTrue(shoppingCartPage.highestProductPrice().equals("$49.99"),"Product is not sorted from highest price to lowest price!");
    }
}
