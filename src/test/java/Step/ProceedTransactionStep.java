package Step;

import Enum.Credential;
import Page.LoginPage;
import Page.ProceedTransactionPage;
import Page.ShoppingCartPage;
import org.testng.Assert;


public class ProceedTransactionStep {

    private ProceedTransactionPage proceedTransactionPage;

    public ProceedTransactionStep(ProceedTransactionPage proceedTransactionPage){
        this.proceedTransactionPage = proceedTransactionPage;
    }

    public void userDoesCheckout() {
        proceedTransactionPage.clickOnShoppingCart();
        proceedTransactionPage.clickOnCheckoutButton();
    }

    public void userInputsValidDataToProceedTransaction() {
        proceedTransactionPage.inputOnFirstNameInputPlaceholder();
        proceedTransactionPage.inputOnLastNameInputPlaceholder();
        proceedTransactionPage.inputOnPostalCodeInputPlaceholder();
        proceedTransactionPage.clickOnContinueButton();
    }

    public void userIsAtOrderVerificationPage() {
        Assert.assertTrue(proceedTransactionPage.paymentInformationHeaderText().equals(proceedTransactionPage.paymentInformationHeaderTitle) &&
                proceedTransactionPage.shippingInformationHeaderText().equals(proceedTransactionPage.shippingInformationHeaderTitle) &&
                proceedTransactionPage.priceTotalHeaderText().equals(proceedTransactionPage.priceTotalHeaderTitle),"User is not at the order verification page!");
    }
}
