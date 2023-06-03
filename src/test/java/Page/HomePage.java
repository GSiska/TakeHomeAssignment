package Page;

import Manager.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LoginPage{
    public HomePage(WebDriverManager webDriverManager) {
        super(webDriverManager);
    }

    @FindBy(xpath = "//div[@class='app_logo']")
    public WebElement homepageLogo;

    public boolean homepageLogoIsDisplayed() {
        return homepageLogo.isDisplayed();
    }
}
