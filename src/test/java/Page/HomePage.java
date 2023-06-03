package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='app_logo']")
    public WebElement homepageLogo;

    public boolean homepageLogoIsDisplayed() {
        return homepageLogo.isDisplayed();
    }
}
