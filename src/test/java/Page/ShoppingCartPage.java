package Page;

import Manager.WebDriverManager;
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

    public void clickOnProductFilter() {
        productFilter.click();
    }

    public void clickOnOptionHighPriceToLowPrice() {
        optionHighPriceToLowPrice.click();
    }

    public String highestProductPrice() {
        return highestProduct.getText();
    }
}
