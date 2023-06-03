package Page;

import Manager.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends LoginPage{
    public ShoppingCartPage(WebDriverManager webDriverManager) {
        super(webDriverManager);
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement productFilter;

    @FindBy(xpath = "//option[@value='hilo']")
    public WebElement optionHighPriceToLowPrice;

    @FindBy(xpath = "//div[@class='inventory_item'][1]/div[2]/div[2]/div")
    public WebElement highestProduct;

    @FindBy(xpath = "//div[@class='inventory_item'][1]/div[2]/div/a/div")
    public WebElement firstProduct;

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    public WebElement selectedProductName;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    public WebElement selectedProductPrice;

    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-fleece-jacket']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@name='remove-sauce-labs-fleece-jacket']")
    public WebElement removeButton;

    public void clickOnProductFilter() {
        productFilter.click();
    }

    public void clickOnOptionHighPriceToLowPrice() {
        optionHighPriceToLowPrice.click();
    }

    public String highestProductPrice() {
        return highestProduct.getText();
    }

    public void clickOnFirstProduct() {
        firstProduct.click();
    }

    public String selectedProductNameText() {
        return selectedProductName.getText();
    }

    public String selectedProductPriceText() {
        return selectedProductPrice.getText();
    }

    public void userClicksOnAddToCartButton() {
        addToCartButton.click();
    }

    public boolean removeButtonAppears() {
        return removeButton.isDisplayed();
    }
}
