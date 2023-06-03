package Page;

import Manager.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Enum.Credential;

public class ProceedTransactionPage extends LoginPage{
    public ProceedTransactionPage(WebDriverManager webDriverManager) {
        super(webDriverManager);
    }

    public String paymentInformationHeaderTitle = "Payment Information";
    public String shippingInformationHeaderTitle = "Shipping Information";
    public String priceTotalHeaderTitle = "Price Total";

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//button[contains(@class,'checkout_button')]")
    public WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement firstNameInputPlaceholder;

    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement lastNameInputPlaceholder;

    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElement postalCodeInputPlaceholder;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='summary_info_label'][1]")
    public WebElement paymentInformationHeader;

    @FindBy(xpath = "//div[@class='summary_info_label'][2]")
    public WebElement shippingInformationHeader;

    @FindBy(xpath = "//div[@class='summary_info_label'][3]")
    public WebElement priceTotalHeader;


    public void clickOnShoppingCart() {
        shoppingCart.click();
    }

    public void clickOnCheckoutButton() {
        checkoutButton.click();
    }

    public void inputOnFirstNameInputPlaceholder() {
        firstNameInputPlaceholder.sendKeys(Credential.FIRSTNAME.getCredential());
    }

    public void inputOnLastNameInputPlaceholder() {
        lastNameInputPlaceholder.sendKeys(Credential.LASTNAME.getCredential());
    }

    public void inputOnPostalCodeInputPlaceholder() {
        postalCodeInputPlaceholder.sendKeys(Credential.POSTALCODE.getCredential());
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }

    public String paymentInformationHeaderText() {
        return paymentInformationHeader.getText();
    }

    public String shippingInformationHeaderText() {
        return shippingInformationHeader.getText();
    }

    public String priceTotalHeaderText() {
        return priceTotalHeader.getText();
    }
}
