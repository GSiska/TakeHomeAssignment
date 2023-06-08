package Page;

import Manager.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Enum.Credential;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import org.picocontainer.behaviors.FieldDecorated;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

public class LoginPage extends Base{

    WebDriverManager webDriverManager;

    public LoginPage(WebDriverManager webDriverManager) {
        this.webDriverManager=webDriverManager;
        initElement();
    }

    private void initElement() {
        PageFactory.initElements(getDriver(), this);
        driver = getDriver();
    }

    protected WebDriver getDriver() {
        return webDriverManager.getDriver();
    }

    public static String websiteLink = "https://www.saucedemo.com/";

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//input[@name='login-button']")
    public WebElement loginSubmitButton;

    public void inputLoginUserName() {
        loginUserName.sendKeys(Credential.USERNAME.getCredential());
    }

    public void inputloginPassword() {
        loginPassword.sendKeys(Credential.PASSWORD.getCredential());
    }

    public void clickOnLoginSubmitButton() {
        loginSubmitButton.click();
    }

    public void userIsAtLoginPage() {webDriverManager.getDriver().get(websiteLink);
        webDriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
